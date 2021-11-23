private void trim(int[] codeInt) {
    for (int x = 0; x < (codeInt.length); x = x + 1) {
        if ((codeInt[x]) < 0) {
            codeInt[x] = (codeInt[x]) + 26;
        }
    }
}