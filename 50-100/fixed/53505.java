public void sort(java.util.Comparator<java.lang.Integer> comparator) {
    sortedInUse = true;
    if (selectedInUse) {
        for (int i = 0; i < (size); i++) {
            sorted[i] = selected[i];
        }
    }else {
        for (int i = 0; i < (size); i++) {
            sorted[i] = i;
        }
    }
    java.util.Arrays.sort(sorted, 0, size, comparator);
}