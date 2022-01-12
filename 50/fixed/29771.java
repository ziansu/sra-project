private int UnpackLittle16(int integer) {
    return ((integer & 255) << 8) | ((integer & 65280) >> 8);
}