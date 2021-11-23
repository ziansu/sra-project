public static void keyCheck(int alpha, int beta) {
    if ((((alpha < 1) || (alpha > 26)) || (beta < 1)) || (beta > 26)) {
        java.lang.System.out.println("Error key must have values greater than 0 and less than 26");
        java.lang.System.exit(0);
    }
}