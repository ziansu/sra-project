public int getValue(int idx) {
    return (buffer.getShort(((idx * 2) + 2))) & 65535;
}