private void initCells(java.lang.Integer rows, java.lang.Integer columns) {
    for (java.lang.Integer row = 0; row < rows; row++) {
        java.util.List<ar.fiuba.tdd.grupo04.ICell> rowList = new java.util.ArrayList<ar.fiuba.tdd.grupo04.ICell>();
        this.cells.add(rowList);
        for (java.lang.Integer column = 0; column < columns; column++) {
            rowList.add(new ar.fiuba.tdd.grupo04.NumberCell());
        }
    }
}