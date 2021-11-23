private void calc(int[] data) {
    if ((data.length) == 0) {
        min = 0;
        max = 0;
        average = 0;
        return ;
    }
    min = java.lang.Integer.MAX_VALUE;
    max = java.lang.Integer.MIN_VALUE;
    average = 0;
    for (int i : data) {
        average += i;
        if (i > (max)) {
            max = i;
            continue;
        }
        if (i < (min)) {
            min = i;
        }
    }
    average /= data.length;
}