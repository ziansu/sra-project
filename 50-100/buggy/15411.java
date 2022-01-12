static int[] addResult(int[] mas, int num, int length) {
    for (int i = 0; i < length; i++) {
        if ((mas[i]) < num) {
            for (int j = i; j < (length - 1); j++) {
                mas[(j + 1)] = mas[j];
            }
            mas[i] = num;
        }
    }
    return mas;
}