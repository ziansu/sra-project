@java.lang.Override
public int compare(org.jutility.common.datatype.table.CellLocation lhs, org.jutility.common.datatype.table.CellLocation rhs) {
    int compareRows = (rhs.getRow()) - (lhs.getRow());
    if (compareRows == 0) {
        return (rhs.getColumn()) - (lhs.getColumn());
    }
    return compareRows;
}