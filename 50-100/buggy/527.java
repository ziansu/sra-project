protected java.lang.String getSelectedXmlString(java.lang.String categoryName) throws java.lang.Exception {
    java.lang.String xmlString = null;
    com.wwidesigner.gui.StudyModel.Category category = getCategory(categoryName);
    com.jidesoft.app.framework.file.FileDataModel model = ((com.jidesoft.app.framework.file.FileDataModel) (category.getSelectedSubValue()));
    if ((model != null) && ((model.getApplication()) != null)) {
        model.getApplication().getDataView(model).updateModel(model);
        xmlString = ((java.lang.String) (model.getData()));
    }
    return xmlString;
}