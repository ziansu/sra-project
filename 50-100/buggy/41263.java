public void randomizedQuickSort(java.util.ArrayList<java.lang.Integer> arrayList, int left, int right) {
    if (left < right) {
        int index = randomizedPartition(arrayList, left, right);
        quickSort(arrayList, left, (index - 1));
        quickSort(arrayList, (index + 1), right);
    }
}