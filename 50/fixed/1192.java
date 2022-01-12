@java.lang.Override
protected void init(com.vaadin.server.VaadinRequest vaadinRequest) {
    navigator = new com.vaadin.navigator.Navigator(this, this);
    initRepository();
    ru.dmitriy.selectioncommittee.ui.manager.ScreenManager.init(navigator);
}