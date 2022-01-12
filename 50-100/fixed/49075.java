public void shiftElements(int begin, boolean toRight) {
    if (toRight) {
        for (int i = currentSize; i > begin; i--) {
            array[i] = array[(i - 1)];
        }
    }else {
        for (int i = begin; i < (currentSize); i++) {
            array[i] = array[(i + 1)];
        }
    }
}