public int substract() throws java.io.IOException {
    if (((end) - (start)) == 0) {
        if ((in) == null) {
            return -1;
        }
        int n = in.realReadChars();
        if (n < 0) {
            return -1;
        }
    }
    return buff[((start)++)];
}