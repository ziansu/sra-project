public static int isPaired(int[] a) {
    for (int i = 0; i < (a.length); i++) {
        if ((((i % 2) == 0) && (((a[i]) % 2) == 0)) || (((i % 2) != 0) && (((a[i]) % 2) != 0)))
            return 0;
        
    }
    return 1;
}