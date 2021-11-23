private void setOffset(int x, int z, int offset) throws java.io.IOException {
    offsets[(x + (z * 32))] = offset;
    file.seek(((x + (z * 32)) * 4));
    file.writeInt(offset);
}