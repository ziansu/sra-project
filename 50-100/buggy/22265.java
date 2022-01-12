private static void getDivisors(int numb, int[] divisors) {
    int idx = 0;
    for (int j = 0; j < numb; j++) {
        if (((numb / j) * j) == numb) {
            divisors[(idx++)] = j;
        }
    }
}