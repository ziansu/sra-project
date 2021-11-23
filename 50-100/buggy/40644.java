private static void checkToCheckStraight(java.util.List<java.lang.Integer> x, boolean[] y) {
    boolean flagToCheck = false;
    for (int i = 0; i <= ((y.length) - 1); i++) {
        if (i == 4) {
            continue;
        }else
            if ((y[i]) == true) {
                flagToCheck = true;
                break;
            }
        
    }
    if (flagToCheck == false) {
        week1Problems.P6.checkStraight(x, y);
    }
}