public com.silverpeas.form.DataRecord getDataRecord() throws com.silverpeas.webpages.model.WebPagesException {
    try {
        com.silverpeas.publicationTemplate.PublicationTemplate pubTemplate = getXMLTemplate();
        com.silverpeas.form.RecordSet recordSet = pubTemplate.getRecordSet();
        com.silverpeas.form.DataRecord data = recordSet.getRecord("0");
        if (data == null) {
            data = recordSet.getEmptyRecord();
            data.setId("0");
        }
        return data;
    } catch (java.lang.Exception e) {
        throw new com.silverpeas.webpages.model.WebPagesException("WebPagesSessionController.getDataRecord()", org.silverpeas.util.exception.SilverpeasException.ERROR, "webPages.EX_CANT_GET_DATA", e);
    }
}