private void setOffset(int x, int z, int offset) throws java.io.IOException {
    this.offsets[(x + (z * 32))] = offset;
    this.file.seek(((x + (z * 32)) * 4));
    this.file.writeInt(offset);
}