protected void createHeader() {
    setPrimaryStyleName("valo-menu");
    addStyleName("valo-menu-part");
    com.vaadin.ui.HorizontalLayout headercontent = new com.vaadin.ui.HorizontalLayout(header);
    headercontent.setMargin(false);
    for (com.vaadin.ui.Component component : headercontent) {
        headercontent.setComponentAlignment(component, Alignment.MIDDLE_CENTER);
    }
    headercontent.setStyleName("valo-menu-title");
    addComponent(headercontent);
}