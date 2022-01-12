@java.lang.Override
public java.util.ArrayList<org.opentdc.workrecords.WorkRecordModel> listWorkRecords(java.lang.String queryType, java.lang.String query, long position, long size) {
    org.opentdc.workrecords.file.FileServiceProvider.logger.info((("listWorkRecords() -> " + (countWorkRecords())) + " values"));
    return new java.util.ArrayList<org.opentdc.workrecords.WorkRecordModel>(org.opentdc.workrecords.file.FileServiceProvider.index.values());
}