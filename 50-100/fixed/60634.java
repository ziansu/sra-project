@java.lang.Override
protected void setup(com.vaadin.server.VaadinRequest request) {
    com.vaadin.ui.Upload upload = new com.vaadin.ui.Upload();
    upload.setId("immediateupload");
    addComponent(upload);
    com.vaadin.ui.Upload immediateUpload = new com.vaadin.ui.Upload();
    immediateUpload.setId("upload");
    immediateUpload.setImmediateMode(false);
    addComponent(immediateUpload);
}