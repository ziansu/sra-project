public void addProfileItems(org.unicef.rapidreg.service.cache.ItemValuesMap itemValues, java.util.Date registrationDate, java.lang.String uniqueId, long recordId) {
    java.lang.String shortUUID = recordService.getShortUUID(uniqueId);
    java.text.DateFormat dateFormat = java.text.SimpleDateFormat.getDateInstance(java.text.DateFormat.MEDIUM, java.util.Locale.US);
    itemValues.addStringItem(ItemValuesMap.RecordProfile.ID_NORMAL_STATE, shortUUID);
    itemValues.addStringItem(ItemValuesMap.RecordProfile.REGISTRATION_DATE, dateFormat.format(registrationDate));
    itemValues.addNumberItem(ItemValuesMap.RecordProfile.ID, recordId);
}