@java.lang.Override
public int getTotalRows() throws com.salesforce.dataloader.dao.database.DataAccessObjectException {
    if ((totalRows) == 0) {
        totalRows = com.salesforce.dataloader.util.DAORowUtil.calculateTotalRows(this);
    }
    return totalRows;
}