public void buildHeader() {
    header = new com.vaadin.ui.VerticalLayout();
    com.vaadin.ui.Label headerLabel = new com.vaadin.ui.Label((("<h1>" + (app.getMessage(UimsMessages.RegistrationHeader))) + "</h1>"));
    headerLabel.setContentMode(Label.CONTENT_XHTML);
    header.addComponent(headerLabel);
    addComponent(header);
}