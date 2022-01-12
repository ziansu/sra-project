@java.lang.Override
public int compare(org.jutility.common.datatype.table.CellLocation lhs, org.jutility.common.datatype.table.CellLocation rhs) {
    int compareRows = (lhs.getRow()) - (rhs.getRow());
    if (compareRows == 0) {
        return (lhs.getColumn()) - (rhs.getColumn());
    }
    return compareRows;
}