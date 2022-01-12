public static void selectionSort(int[] data) {
    for (int index = 0; index < (data.length); index++) {
        int minimum = data[index];
        int minimumIndex = index;
        for (int tracker = index + 1; tracker < (data.length); tracker++) {
            if ((data[tracker]) < minimum) {
                minimum = data[tracker];
                minimumIndex = tracker;
            }
        }
    }
}