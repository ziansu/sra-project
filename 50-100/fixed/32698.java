public static int compare(int[] srcVersionArray, int[] destVersionArray, int type) {
    for (int j = srcVersionArray.length; j < (destVersionArray.length); j++) {
        if ((destVersionArray[j]) > 0) {
            return type;
        }
    }
    return 0;
}