public static double calculateTimeA(int len) {
    double sum = 0;
    for (int i = 0; i < 20; i++) {
        sum += MergeSortTester.calculateTime(len);
    }
    return sum / 20;
}