@java.lang.Override
public void run() {
    fractureanalysis.table.TableUtils tu = new fractureanalysis.table.TableUtils();
    for (int i = 0; i < (headerValues.length); i++) {
        tvDataset.getColumns().add(tu.createColumn(i, headerValues[i]));
    }
}