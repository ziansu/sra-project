public static void main(java.lang.String[] args) {
    long sum = 0;
    int i = 1;
    long end = 4000000;
    long fibResult = 1;
    while (fibResult < end) {
        fibResult = answers.Problem2.fibonacci(i);
        if ((fibResult % 2) == 0) {
            sum += fibResult;
        }
        i++;
    } 
    java.lang.System.out.println(sum);
}