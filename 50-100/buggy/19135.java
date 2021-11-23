private static int[] getIntArrayOfRow(int row) {
    int[] result = new int[4];
    for (int i = 0; i < 3; i++) {
        result[i] = maximbravo.com.Maxim2048.MainActivity.b.get(row, i).getId();
    }
    return result;
}