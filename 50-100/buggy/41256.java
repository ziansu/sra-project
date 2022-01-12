private void shiftToLeftFrom(int actualIndex) {
    if ((offset) == 0) {
        offset = (capacity) - 1;
    }else {
        (offset)--;
    }
    int fromIndex;
    for (int toIndex = offset; toIndex != actualIndex; toIndex = fromIndex) {
        if (toIndex == ((capacity) - 1)) {
            fromIndex = 0;
        }else {
            fromIndex = toIndex + 1;
        }
        array[toIndex] = array[fromIndex];
    }
    array[actualIndex] = null;
}