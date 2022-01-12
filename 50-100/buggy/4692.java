static boolean isAscending(int[] values) {
    int old = values[0];
    for (int i = 1; i < (values.length); i++) {
        if (old > (values[i]))
            return false;
        
    }
    return true;
}