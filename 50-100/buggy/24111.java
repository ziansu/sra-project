private void addOrUpdateDataValue(java.lang.String dataElementUID, java.lang.String value) {
    org.eyeseetea.malariacare.data.database.iomodules.dhis.importer.models.DataValueExtended dataValue = null;
    try {
        dataValue = org.eyeseetea.malariacare.data.database.iomodules.dhis.importer.models.DataValueExtended.findByEventAndUID(currentEvent.getEvent(), dataElementUID);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    if ((dataValue.getDataValue()) != null) {
        dataValue.setValue(value);
        dataValue.save();
        return ;
    }
    buildAndSaveDataValue(dataElementUID, value);
}