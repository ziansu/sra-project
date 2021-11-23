public int[] getMask(int n) {
    int[] mask = new int[n];
    for (int i = 0; i < n; i++) {
        if ((java.lang.Math.random()) > 0.5)
            mask[i] = 1;
        else
            mask[i] = 0;
        
    }
    return mask;
}