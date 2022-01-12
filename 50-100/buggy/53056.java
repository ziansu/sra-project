public <T extends org.compiere.model.PO> T getPO() {
    final org.compiere.model.GridTab gridTab = getGridTab();
    final java.lang.String tableName = gridTab.get_TableName();
    final int recordID = gridTab.getKeyID(gridTab.getCurrentRow());
    final java.util.Properties ctx = getCtx();
    @java.lang.SuppressWarnings(value = "unchecked")
    final T po = ((T) (TableModelLoader.instance.getPO(ctx, tableName, recordID, ITrx.TRXNAME_None)));
    return po;
}