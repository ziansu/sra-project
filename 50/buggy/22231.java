@java.lang.Override
public java.lang.Object getValueAt(int row, int column) {
    return model.getValueAt(this.rows[row].index, column);
}