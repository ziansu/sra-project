public javax.swing.table.TableModel createTable(Datastructs.SimpleList.SimpleList<java.lang.Object[]> pGrammar) {
    grammar = pGrammar;
    getRows();
    calcFirsts();
    columns = new java.lang.String[pGrammar.length()];
    final javax.swing.table.TableModel table = new javax.swing.table.DefaultTableModel(firstsArr, rows);
    final javax.swing.table.TableModel table = new javax.swing.table.DefaultTableModel(data, columns);
    grammar = pGrammar;
    followsMatrix = new Datastructs.SimpleList.SimpleList<java.lang.Object[]>();
    return table;
}