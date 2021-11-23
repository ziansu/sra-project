private boolean isInMultiple(int[][] array, int numToTest) {
    int timesSeen = 0;
    for (int[] innerArray : array) {
        if (innerArray != null) {
            for (int number : innerArray) {
                if (number == numToTest) {
                    if ((++timesSeen) > 1) {
                        return true;
                    }
                }
            }
        }
    }
    return false;
}