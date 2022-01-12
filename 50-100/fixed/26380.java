public double[] sort() {
    for (int z = 0; z < ((arrayToSort.length) - 1); z++) {
        int minIdx = getIndexOfMinElement(z);
        if (minIdx != z) {
            swapArrayidx(z, minIdx);
        }
    }
    return arrayToSort;
}