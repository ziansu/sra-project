public static void main(java.lang.String[] args) {
    for (int i = 1; i <= 9; ++i) {
        for (int j = 1; j <= i; ++j) {
            java.lang.System.out.printf("%d*%d=%d\t", j, i, (i * j));
        }
        java.lang.System.out.println();
    }
}