public void put(int[][] array) {
    for (int i = 0; i < (array.length); i += 1) {
        int[] inner = array[i];
        for (int j = 0; j < (array.length); j += 1) {
            int value = inner[j];
            if (value != 0) {
                put(j, i, value);
            }
        }
    }
}