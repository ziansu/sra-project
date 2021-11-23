public static int getKeyFlags(org.spongycastle.openpgp.PGPPublicKey key) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.Iterator<org.spongycastle.openpgp.PGPSignature> sigs = key.getSignatures();
    while (sigs.hasNext()) {
        org.spongycastle.openpgp.PGPSignature sig = sigs.next();
        if (sig != null) {
            org.spongycastle.openpgp.PGPSignatureSubpacketVector subpackets = sig.getHashedSubPackets();
            if ((subpackets != null) && (subpackets.isPrimaryUserID())) {
                return subpackets.getKeyFlags();
            }
        }
    } 
    return 0;
}