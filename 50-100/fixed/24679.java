public static com.google.bitcoin.crypto.TransactionSignature decodeFromBitcoin(byte[] bytes, boolean requireCanonical) throws com.google.bitcoin.core.VerificationException {
    if (requireCanonical && (!(com.google.bitcoin.crypto.TransactionSignature.isEncodingCanonical(bytes))))
        throw new com.google.bitcoin.core.VerificationException("Signature encoding is not canonical.");
    
    com.google.bitcoin.core.ECKey.ECDSASignature sig;
    try {
        sig = ECKey.ECDSASignature.decodeFromDER(bytes);
    } catch (java.lang.IllegalArgumentException e) {
        throw new com.google.bitcoin.core.VerificationException("Could not decode DER", e);
    }
    return new com.google.bitcoin.crypto.TransactionSignature(sig.r, sig.s, bytes[((bytes.length) - 1)]);
}