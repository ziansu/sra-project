@java.lang.Override
public java.lang.Object getValueAt(int row, int column) {
    if (row > (-1)) {
        return model.getValueAt(this.rows[row].index, column);
    }else {
        return null;
    }
}