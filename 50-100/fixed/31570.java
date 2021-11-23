protected void addRolesFieldsToData(java.util.Map<java.lang.Long, jorgediazest.util.data.Data> roleMap, jorgediazest.util.data.Data data) throws com.liferay.portal.kernel.exception.PortalException {
    java.lang.String className = data.get("permissionsClassName", StringPool.BLANK);
    java.lang.String permissionsField;
    if (com.liferay.portal.kernel.service.ResourceBlockLocalServiceUtil.isSupported(className)) {
        permissionsField = com.liferay.portal.kernel.model.ResourceBlockPermission.class.getName();
    }else {
        permissionsField = com.liferay.portal.kernel.model.ResourcePermission.class.getName();
    }
    addRolesFieldsToData(roleMap, className, data, permissionsField);
}