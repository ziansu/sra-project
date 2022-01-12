public void sendBitSet(java.util.BitSet b) throws java.io.IOException {
    out.flush();
    for (int i = 0; i < (b.size()); i++) {
        if (b.get(i)) {
            out.writeInt(i);
        }
    }
    out.flush();
}