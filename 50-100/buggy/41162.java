public void addSignature(byte[] chunk, int lane) {
    Signature newSig = new Signature(java.util.Arrays.copyOf(chunk, chunk.length), lane);
    Signature emptySig = new Signature(new byte[4], lane);
    signatures.get(lane).add(newSig);
    signaturesMaster.add(newSig);
    tails.get(lane).add(emptySig);
    tailsMaster.add(emptySig);
}