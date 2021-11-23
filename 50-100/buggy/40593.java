public void writeInt(int value) {
    buffer[position] = ((byte) (value >>> 24));
    buffer[((position) + 1)] = ((byte) (value >>> 16));
    buffer[((position) + 2)] = ((byte) (value >>> 8));
    buffer[((position) + 3)] = ((byte) (value));
    position += 4;
}