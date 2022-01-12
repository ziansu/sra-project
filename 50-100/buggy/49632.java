@java.lang.Override
public java.lang.String getValueAt(int row, int column) {
    if (((this.keyvaluepairs) == null) || (row > ((this.keyvaluepairs.size()) - 1))) {
        return null;
    }
    switch (column) {
        case gui.models.KeyValueTableModel.COLUMN_KEY :
            return keyvaluepairs.get(row).getA();
        case gui.models.KeyValueTableModel.COLUMN_VALUE :
            return keyvaluepairs.get(row).getB();
    }
    return null;
}