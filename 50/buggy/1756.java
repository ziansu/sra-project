static void bubbleSortNTimes(int[] array, long loopCount) {
    for (int i = 0; i < loopCount; i++) {
        medium.InterruptedBubbleSort.bubbleSortOneIteration(array);
    }
}