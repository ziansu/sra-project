public byte substractB() throws java.io.IOException {
    if (((end) - (start)) == 0) {
        if ((in) == null) {
            return -1;
        }
        int n = in.realReadBytes();
        if (n < 0) {
            return -1;
        }
    }
    return buff[((start)++)];
}