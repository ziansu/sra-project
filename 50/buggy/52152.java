public void write(java.io.DataOutput out) throws java.io.IOException {
    out.writeUTF(description);
    for (int cInt : dimensions) {
        out.writeInt(cInt);
    }
}