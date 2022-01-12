protected com.liferay.dynamic.data.lists.model.DDLRecordSet addRecordSet(javax.portlet.PortletRequest portletRequest, javax.portlet.PortletResponse portletResponse) throws java.lang.Exception {
    com.liferay.dynamic.data.mapping.storage.DDMFormValues settingsDDMFormValues = getSettingsDDMFormValues(portletRequest);
    com.liferay.dynamic.data.mapping.model.DDMStructure ddmStructure = addDDMStructure(portletRequest, settingsDDMFormValues);
    com.liferay.dynamic.data.lists.model.DDLRecordSet recordSet = addRecordSet(portletRequest, ddmStructure.getStructureId());
    updateRecordSetSettings(portletRequest, recordSet, settingsDDMFormValues);
    return recordSet;
}