public void add(java.lang.Character c) {
    characters.add(c);
    calcSpace();
    c.setCellMult(((c.getCellMult()) + (cellMult)));
    c.setMoneyMult(((c.getMoneyMult()) + (moneyMult)));
    c.setSuperCellMult(((c.getSuperCellMult()) + (superCellMult)));
}