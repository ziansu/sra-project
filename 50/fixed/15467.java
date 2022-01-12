private java.lang.String[] getSimpleExtentTagRowData(edu.brandeis.cs.nlp.mae.controller.ExtentTag tag) throws edu.brandeis.cs.nlp.mae.database.MaeDBException {
    return new java.lang.String[]{ getDriver().getAnnotationFileName() , tag.getId() , tag.getSpansAsString() , tag.getText() };
}