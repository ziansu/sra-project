private com.vaadin.ui.HorizontalLayout createUploadLayout() {
    initUpload();
    initProgressBar();
    com.vaadin.ui.HorizontalLayout header = new com.vaadin.ui.HorizontalLayout();
    header.setStyleName("header");
    header.setWidth("100%");
    header.setMargin(true);
    header.addComponents(upload, progressBar);
    header.setComponentAlignment(progressBar, Alignment.MIDDLE_CENTER);
    header.setExpandRatio(progressBar, 1);
    return header;
}