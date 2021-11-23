private static java.lang.Double percentageOfSames(java.util.List<java.lang.Integer> arr) {
    int min = arr.get(0);
    for (int a : arr) {
        if (a < min) {
            min = a;
        }
    }
    int x = 0;
    for (int a : arr) {
        if (min == a) {
            x++;
        }
    }
    return ((double) (x)) / (arr.size());
}