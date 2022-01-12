public synchronized void loadData(int[][] original_data) {
    for (int i = 0; i < (original_data.length); i++) {
        java.util.ArrayList<java.lang.Integer> values = new java.util.ArrayList<java.lang.Integer>();
        for (int j = 0; j < (original_data[i].length); j++) {
            values.add(original_data[i][j]);
        }
        data.add(values);
    }
}