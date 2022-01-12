static int getKeyFlags(org.bouncycastle.openpgp.PGPPublicKey key) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.Iterator<org.bouncycastle.openpgp.PGPSignature> sigs = key.getSignatures();
    while (sigs.hasNext()) {
        org.bouncycastle.openpgp.PGPSignature sig = sigs.next();
        org.bouncycastle.openpgp.PGPSignatureSubpacketVector subpackets = sig.getHashedSubPackets();
        if (subpackets == null)
            return 0;
        
        return subpackets.getKeyFlags();
    } 
    return 0;
}