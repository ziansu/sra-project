public void put(int[][] array) {
    for (int i = 0; i < (array.length); i += 1) {
        int[] inner = array[i];
        for (int j = 0; j < (inner.length); j += 1) {
            int value = inner[j];
            put(j, i, value);
        }
    }
}