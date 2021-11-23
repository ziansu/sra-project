public static boolean allValuesSame(double[] split) {
    if ((split.length) == 1) {
        return false;
    }
    boolean allValuesSame = true;
    for (int x = 0; x < ((split.length) - 1); x++) {
        if ((split[x]) != (split[(x + 1)]))
            allValuesSame = false;
        
    }
    return allValuesSame;
}