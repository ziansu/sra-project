public void randomizedQuickSort(java.util.ArrayList<java.lang.Integer> arrayList, int left, int right) {
    if (left < right) {
        int index = randomizedPartition(arrayList, left, right);
        randomizedQuickSort(arrayList, left, (index - 1));
        randomizedQuickSort(arrayList, (index + 1), right);
    }
}