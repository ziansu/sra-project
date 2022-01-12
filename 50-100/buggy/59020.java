public static boolean dobValidation(int y, int m, int d) {
    if (((y == 5) || (y >= 5)) && ((m > 11) || (m > 0))) {
        return true;
    }else
        return ((d > 29) || (d < 0)) && ((m > 11) || (m < 0));
    
}