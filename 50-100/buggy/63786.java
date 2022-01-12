public void drawCells() {
    for (int i = 0; i < (cols); i++) {
        java.lang.System.out.print(("i = " + i));
        for (int j = 0; j < (rows); j++) {
            java.lang.System.out.println(("j = " + j));
            cells[j][i] = new levelBuilder.Cell(j, i);
            add(cells[j][i]);
        }
    }
}