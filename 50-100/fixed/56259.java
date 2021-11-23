private static boolean retire(int row, int column) {
    if (((++row) == (-1)) && ((++column) == (-1))) {
        java.lang.System.out.print("¿De verdad desea retirarse del juego?: ");
        return new java.util.Scanner(java.lang.System.in).next().equalsIgnoreCase("SI");
    }
    return false;
}