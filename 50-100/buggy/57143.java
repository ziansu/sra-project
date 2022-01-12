private static java.lang.Comparable[] getBenchmarkData() {
    java.util.ArrayList<java.lang.Comparable> listToSort = new java.util.ArrayList<>();
    for (int i = 0; i < 10000; ++i) {
        listToSort.add(((int) ((java.lang.Math.random()) * 10000)));
    }
    java.lang.Comparable[] mess = new java.lang.Comparable[listToSort.size()];
    return listToSort.toArray(mess);
}