private double min(double[] array) {
    for (int j = 0; j < (array.length); j++) {
        for (int k = j + 1; k < 4; k++) {
            if ((array[j]) > (array[k])) {
                double temp;
                temp = array[j];
                array[j] = array[k];
                array[k] = temp;
            }
        }
    }
    return array[0];
}