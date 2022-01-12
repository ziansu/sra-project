public static void main(java.lang.String[] args) {
    int n = 1;
    while (n <= 1000) {
        if (((n % 3) == 0) || ((n % 5) == 0))
            java.lang.System.out.printf(("%d" + (n == 1000 ? "" : " , ")), n);
        
        n++;
    } 
}