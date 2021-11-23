public static int getRow(int rowCol) {
    return rowCol == 10 ? 1 : rowCol % 10;
}