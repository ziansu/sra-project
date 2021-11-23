public void forPrint() {
    for (int r = 0; r < (array.length); r++) {
        for (int c = 0; c < (array[r].length); c++) {
            java.lang.System.out.print(array[r][c]);
            java.lang.System.out.print(" ");
        }
        java.lang.System.out.println();
    }
}