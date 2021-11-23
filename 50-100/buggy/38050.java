public static boolean contains(int[] array, int val) {
    for (int i = 0; i < (array.length); i++) {
        if ((array[i]) == val)
            return true;
        else
            return false;
        
    }
    return false;
}