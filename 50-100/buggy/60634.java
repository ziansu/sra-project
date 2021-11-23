@java.lang.Override
protected void setup(com.vaadin.server.VaadinRequest request) {
    com.vaadin.ui.Upload upload = new com.vaadin.ui.Upload();
    upload.setId("upload");
    addComponent(upload);
    com.vaadin.ui.Upload immediateUpload = new com.vaadin.ui.Upload();
    immediateUpload.setId("immediateupload");
    immediateUpload.setImmediateMode(true);
    addComponent(immediateUpload);
}