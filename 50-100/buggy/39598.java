public int[] nextIntArray(int n) throws java.io.IOException {
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
        a[i] = nextInt();
    
    return a;
}