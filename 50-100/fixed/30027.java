@java.lang.Override
public cern.colt.bitvector.BitVector generateIndexForToken(java.lang.String token, com.kryptnostic.crypto.EncryptedSearchSharingKey sharingKey) throws com.kryptnostic.kodex.v1.exceptions.types.ResourceNotFoundException {
    cern.colt.bitvector.BitVector searchHash = connection.getEncryptedSearchPrivateKey().hash(token);
    com.kryptnostic.linear.EnhancedBitMatrix expectedMatrix = com.kryptnostic.linear.EnhancedBitMatrix.squareMatrixfromBitVector(getGlobalHashFunction().apply(searchHash));
    cern.colt.bitvector.BitVector indexForTerm = com.kryptnostic.bitwise.BitVectors.fromSquareMatrix(expectedMatrix.multiply(sharingKey.getMiddle()).multiply(expectedMatrix));
    return indexForTerm;
}