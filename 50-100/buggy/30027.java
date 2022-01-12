@java.lang.Override
public cern.colt.bitvector.BitVector generateIndexForToken(java.lang.String token, cern.colt.bitvector.BitVector searchNonce, com.kryptnostic.crypto.EncryptedSearchSharingKey sharingKey) throws com.kryptnostic.kodex.v1.exceptions.types.ResourceNotFoundException {
    cern.colt.bitvector.BitVector searchHash = connection.getEncryptedSearchPrivateKey().hash(token);
    cern.colt.bitvector.BitVector searchToken = com.kryptnostic.bitwise.BitVectors.concatenate(searchHash, searchNonce);
    com.kryptnostic.linear.EnhancedBitMatrix expectedMatrix = com.kryptnostic.linear.EnhancedBitMatrix.squareMatrixfromBitVector(getGlobalHashFunction().apply(searchToken));
    cern.colt.bitvector.BitVector indexForTerm = com.kryptnostic.bitwise.BitVectors.fromSquareMatrix(expectedMatrix.multiply(sharingKey.getMiddle()).multiply(expectedMatrix));
    return indexForTerm;
}