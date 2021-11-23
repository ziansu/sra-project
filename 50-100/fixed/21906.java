private void fill() throws java.io.IOException {
    if ((catchSize) == 0) {
        catchSize = in.read(cb);
        charIndex = 0;
    }else {
        cb[0] = cb[((catchSize) - 1)];
        catchSize = (in.read(cb, 1, ((catchLength) - 1))) + 1;
        charIndex = 0;
    }
}