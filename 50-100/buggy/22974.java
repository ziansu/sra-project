public void add(java.lang.Character c) {
    characters.add(c);
    java.lang.System.out.println(("Before: " + (space)));
    calcSpace();
    java.lang.System.out.println(("After: " + (space)));
    c.setCellMult(((c.getCellMult()) + (cellMult)));
    c.setMoneyMult(((c.getMoneyMult()) + (moneyMult)));
    c.setSuperCellMult(((c.getSuperCellMult()) + (superCellMult)));
}