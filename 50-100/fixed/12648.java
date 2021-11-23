public void KSA() {
    int j = 0;
    int temp = 0;
    for (int i = 0; i < 256; i++) {
        j = ((j + (S[i])) + (key[(i % (key.length))])) % 256;
        temp = S[i];
        S[i] = S[j];
        S[j] = temp;
        temp = 0;
    }
}