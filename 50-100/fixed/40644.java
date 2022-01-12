private static void checkToCheckStraight(java.util.List<java.lang.Integer> x, boolean[] y) {
    boolean flagToCheck = true;
    for (int i = 0; i <= ((y.length) - 1); i++) {
        if (i == 4) {
            continue;
        }else
            if ((y[i]) == true) {
                flagToCheck = false;
                break;
            }
        
    }
    if (flagToCheck == true) {
        week1Problems.P6.checkStraight(x, y);
    }
}