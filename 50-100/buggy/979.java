@com.google.gwt.uibinder.client.UiHandler(value = "uploadImageLbl")
public void clickOnUploadImg(com.google.gwt.event.dom.client.ClickEvent saveCourseEvent) {
    org.ednovo.gooru.application.shared.model.folder.CreateDo createOrUpDate = new org.ednovo.gooru.application.shared.model.folder.CreateDo();
    createOrUpDate.setTitle(collectionTitle.getText());
    createOrUpDate.setDescription(learningObjective.getText());
    createOrUpDate.setCollectionType(type);
    createOrUpDate.setDescription(learningObjective.getText());
    createOrUpDate.setUrl(courseObjG.getThumbnails().getUrl());
    getUiHandlers().uploadCollectionImage(createOrUpDate);
}