@java.lang.Override
public void refreshDatabaseRecord(canreg.common.database.DatabaseRecord record, boolean isSaveNeeded) {
    setDatabaseRecord(record);
    setSaveNeeded(isSaveNeeded);
    buildPanel();
    refreshCheckStatus(record);
    refreshRecordStatus(record);
    refreshUpdatedBy();
    if ((this.patient) != null)
        patient.refreshDatabaseRecord(this.patient.getDatabaseRecord(), this.patient.isSaveNeeded());
    
}