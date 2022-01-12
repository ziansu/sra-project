public static java.lang.String convertToTitleRecursive(int n) {
    java.lang.String s = "";
    if (n > 26) {
        s += ExcelSheetColumnTitle.convertToTitleRecursive(((n - 1) / 26));
        n -= 26;
    }
    int r = (n - 1) % 26;
    int d = r + 65;
    s += ((char) (d));
    return s;
}