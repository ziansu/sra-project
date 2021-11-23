private void shiftToRightFrom(int actualIndex) {
    int lastOffset = getLastOffset();
    int fromIndex;
    for (int toIndex = lastOffset; toIndex != actualIndex; toIndex = fromIndex) {
        if (toIndex == 0) {
            fromIndex = (capacity) - 1;
        }else {
            fromIndex = toIndex - 1;
        }
        array[toIndex] = array[fromIndex];
    }
    array[actualIndex] = null;
}