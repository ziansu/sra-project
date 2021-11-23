public boolean isXMLContentDefined() throws com.silverpeas.webpages.model.WebPagesException {
    com.silverpeas.form.DataRecord data;
    try {
        com.silverpeas.publicationTemplate.PublicationTemplate pubTemplate = getXMLTemplate();
        com.silverpeas.form.RecordSet recordSet = pubTemplate.getRecordSet();
        data = recordSet.getRecord("0", getLanguage());
        return data != null;
    } catch (java.lang.Exception e) {
        throw new com.silverpeas.webpages.model.WebPagesException("WebPagesSessionController.isXMLContentDefined()", com.stratelia.webactiv.util.exception.SilverpeasException.ERROR, "webPages.EX_CANT_GET_DATA", e);
    }
}