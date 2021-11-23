public void setMap(pekkakana.PK2Map map) {
    this.map = map;
    setList();
    dfm.fireTableDataChanged();
}