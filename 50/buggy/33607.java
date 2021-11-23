public void print() {
    for (int[] aMatrix : matrix) {
        for (int anAMatrix : aMatrix) {
            java.lang.System.out.print(("" + anAMatrix));
        }
        java.lang.System.out.println();
    }
}