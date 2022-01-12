private static java.lang.Double percentageOfSames(java.util.List<java.lang.Integer> arr) {
    int max = arr.get(0);
    for (int a : arr) {
        if (a > max) {
            max = a;
        }
    }
    int x = 0;
    for (int a : arr) {
        if (max == a) {
            x++;
        }
    }
    return ((double) (x)) / (arr.size());
}