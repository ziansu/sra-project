@java.lang.Override
protected void init(com.vaadin.server.VaadinRequest vaadinRequest) {
    com.PubliciBot.UI.ABMTagsController ABCTRL = new com.PubliciBot.UI.ABMTagsController(this);
    setContent(ABCTRL);
}