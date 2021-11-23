public static java.util.List<java.lang.Integer> make(int size) {
    java.util.List<java.lang.Integer> list = new java.util.ArrayList<java.lang.Integer>();
    for (int i = 1; i <= size; i++) {
        int num = ((int) (java.lang.Math.abs((((ListCreator.numberRange) + 1) * (java.lang.Math.random())))));
        list.add(num);
    }
    return QuickSort.quickSort(list);
}