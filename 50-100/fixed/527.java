protected java.lang.String getSelectedXmlString(java.lang.String categoryName) throws java.lang.Exception {
    com.wwidesigner.gui.StudyModel.Category category = getCategory(categoryName);
    com.jidesoft.app.framework.file.FileDataModel model = ((com.jidesoft.app.framework.file.FileDataModel) (category.getSelectedSubValue()));
    if (model == null) {
        return null;
    }
    if ((model.getApplication()) != null) {
        model.getApplication().getDataView(model).updateModel(model);
    }
    return ((java.lang.String) (model.getData()));
}