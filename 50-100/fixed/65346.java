public static boolean isPerfectNumb(int numb) {
    int[] divisors = new int[500];
    PerfectNumbers.getDivisors(numb, divisors);
    boolean isPerfect = false;
    int sum = 0;
    for (int i = 1; i < 500; i++)
        sum += divisors[i];
    
    if (sum == (input))
        isPerfect = true;
    
    return isPerfect;
}