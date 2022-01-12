private static java.lang.Comparable[] getBenchmarkData(int size) {
    java.util.ArrayList<java.lang.Comparable> listToSort = new java.util.ArrayList<>();
    for (int i = 0; i < size; ++i) {
        listToSort.add(((int) ((java.lang.Math.random()) * size)));
    }
    java.lang.Comparable[] mess = new java.lang.Comparable[listToSort.size()];
    return listToSort.toArray(mess);
}