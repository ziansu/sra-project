public char[][] nextCharacterMatrix(int n) throws java.io.IOException {
    char[][] a = new char[n][];
    for (int i = 0; i < n; i++) {
        a[i] = next().toCharArray();
    }
    return a;
}