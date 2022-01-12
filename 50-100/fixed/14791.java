@java.lang.Override
public java.lang.Object getValueAt(int rowIndex, int columnIndex) {
    if (columnIndex == 0) {
        int tempRow = rowIndex + 1;
        return "Level " + tempRow;
    }else
        if (columnIndex == 1) {
            return (accuracyList.get(rowIndex)) + "%";
        }
    
    return null;
}