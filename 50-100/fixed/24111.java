private void addOrUpdateDataValue(java.lang.String dataElementUID, java.lang.String value) {
    org.eyeseetea.malariacare.data.database.iomodules.dhis.importer.models.DataValueExtended dataValue = org.eyeseetea.malariacare.data.database.iomodules.dhis.importer.models.DataValueExtended.findByEventAndUID(currentEvent.getEvent(), dataElementUID);
    if ((dataValue != null) && ((dataValue.getDataValue()) != null)) {
        dataValue.setValue(value);
        dataValue.save();
        return ;
    }
    buildAndSaveDataValue(dataElementUID, value);
}