public static void main(java.lang.String[] args) {
    int n = 1;
    int sum = 0;
    while (n < 1000) {
        if (((n % 3) == 0) || ((n % 5) == 0)) {
            sum += n;
        }
        n++;
    } 
    java.lang.System.out.println(sum);
}