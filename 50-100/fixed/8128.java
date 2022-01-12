public boolean check() {
    for (java.lang.String cellAsString : cellsAsString) {
        java.util.Set<java.lang.Integer> set = new java.util.HashSet<>();
        for (ar.fiuba.tdd.tp1.cell.Cell cellValue : calculateCellList(cellAsString)) {
            if (!(set.add(java.lang.Integer.parseInt(cellValue.getData())))) {
                return false;
            }
        }
    }
    return true;
}