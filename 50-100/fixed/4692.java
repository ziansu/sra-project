static boolean isAscending(int[] values) {
    for (int i = 1; i < (values.length); i++) {
        if ((values[(i - 1)]) > (values[i]))
            return false;
        
    }
    return true;
}