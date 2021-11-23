public static void main(java.lang.String[] args) {
    int num = 1;
    int sum = 0;
    while (num < 2000000) {
        if (com.sandlex.euler.Problem010.isPrime((++num))) {
            sum += num;
        }
    } 
    java.lang.System.out.println(sum);
}