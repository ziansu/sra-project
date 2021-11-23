private static void getDivisors(int numb, int[] divisors) {
    int idx = 0;
    for (int j = 1; j < numb; j++) {
        if (((numb / j) * j) == numb) {
            divisors[(idx++)] = j;
        }
    }
}