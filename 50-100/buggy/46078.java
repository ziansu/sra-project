public void addValue(java.lang.String column, java.lang.String value) {
    ninja.javafx.smartcsv.fx.table.model.CSVValue v = new ninja.javafx.smartcsv.fx.table.model.CSVValue();
    v.setValidator(validator);
    v.setValue(value);
    v.setColumn(column);
    v.setRowNumber(rowNumber);
    columns.put(column, new javafx.beans.property.SimpleObjectProperty(v));
}