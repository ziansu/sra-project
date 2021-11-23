public int[] bubbleSort(int[] leArray) {
    for (int i = (leArray.length) - 1; i > 0; i--) {
        for (int n = 0; n < i; n++) {
            if ((leArray[n]) > (leArray[(n + 1)])) {
                switchVals(leArray[n], leArray[(n + 1)]);
            }
        }
    }
    return leArray;
}