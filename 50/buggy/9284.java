@java.lang.Override
public com.pratilipi.data.type.Pratilipi createOrUpdatePratilipi(com.pratilipi.data.type.Pratilipi pratilipi, com.pratilipi.data.type.AuditLog auditLog) {
    com.pratilipi.data.mock.PratilipiMock.PRATILIPI_TABLE.add(pratilipi);
    return pratilipi;
}