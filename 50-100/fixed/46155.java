private static boolean isMatrix(int[][] data) {
    if (((data == null) || ((data.length) == 0)) || ((data[0].length) == 0))
        return false;
    
    for (int i = 1; i < (data.length); i++) {
        if ((data[i].length) != (data[0].length)) {
            return false;
        }
    }
    return true;
}