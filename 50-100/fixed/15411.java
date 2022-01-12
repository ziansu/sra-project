static int[] addResult(int[] mas, int num, int length) {
    for (int i = 0; i < length; i++) {
        if ((mas[i]) < num) {
            for (int j = length - 1; j > i; j--) {
                mas[j] = mas[(j - 1)];
            }
            mas[i] = num;
            break;
        }
    }
    return mas;
}