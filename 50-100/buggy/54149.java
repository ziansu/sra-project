@java.lang.Override
public void setFrozenColumns(int aValue) {
    if ((aValue >= 0) && ((frozenColumns) != aValue)) {
        if (aValue >= 0) {
            frozenColumns = aValue;
            if (((autoRefreshHeader) && ((getDataColumnCount()) > 0)) && (aValue <= (getDataColumnCount()))) {
                applyColumns();
            }
        }
    }
}