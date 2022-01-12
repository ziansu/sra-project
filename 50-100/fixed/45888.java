public static boolean keyCheck(int alpha, int beta) {
    if ((((alpha < 1) || (alpha > 26)) || (beta < 1)) || (beta > 26)) {
        return false;
    }
    return true;
}