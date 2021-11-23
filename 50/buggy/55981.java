@java.lang.Override
public int getDDLRecordsCount(long ddlRecordSetId) throws com.liferay.portal.kernel.exception.SystemException {
    try {
        checkPermission(getPermissionChecker(), ddlRecordSetId, ActionKeys.VIEW);
    } catch (com.liferay.portal.kernel.exception.PortalException pe) {
        throw new com.liferay.portal.kernel.exception.SystemException(pe);
    }
    return ddlRecordPersistence.countByRecordSetId(ddlRecordSetId);
}