@java.lang.Override
public void uploadedImagetobeSet(org.ednovo.gooru.application.shared.model.folder.CreateDo createDoObj) {
    java.lang.System.out.println(("createDoObj.getThumbnails().getUrl()::" + (createDoObj.getUrl())));
    setDataOnEdit(createDoObj.getUrl());
    imageWebUploadUrlTxtBox.setText(createDoObj.getUrl());
    getUiHandlers().imageWebUpload(createDoObj.getUrl());
}