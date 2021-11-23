@java.lang.Override
public void uploadedImagetobeSet(org.ednovo.gooru.application.shared.model.folder.CreateDo createDoObj) {
    java.lang.System.out.println(("createDoObj.getThumbnails().getUrl()::" + (createDoObj.getUrl())));
    if (((createDoObj.getUrl()) != null) && (!(createDoObj.getUrl().isEmpty()))) {
        setDataOnEdit(createDoObj.getUrl());
        imageWebUploadUrlTxtBox.setText(createDoObj.getUrl());
        getUiHandlers().imageWebUpload(createDoObj.getUrl());
    }
}