public static void selectionSort(int[] data) {
    int minimum = data[index];
    for (int index = 0; index < (data.length); index++) {
        minimum = data[index];
        minimumIndex = index;
        for (int tracker = index + 1; tracker < (data.length); tracker++) {
            if ((data[tracker]) < minimum) {
                minimum = data[tracker];
                minimumIndex = tracker;
            }
        }
    }
}