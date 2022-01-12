public void forPrint() {
    for (int c = 0; c < (array[0].length); c++) {
        for (int r = 0; r < (array.length); r++) {
            java.lang.System.out.print(array[r][c]);
            java.lang.System.out.print(" ");
        }
        java.lang.System.out.println();
    }
}