@java.lang.Override
public void run() {
    fractureanalysis.table.TableUtils tu = new fractureanalysis.table.TableUtils();
    for (int column = 0; column < (headerValues.length); column++) {
        tvDataset.getColumns().add(tu.createColumn(column, headerValues[column]));
    }
}