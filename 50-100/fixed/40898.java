protected void handleNavigationError(java.lang.String navigationState, java.lang.Exception e) {
    com.vaadin.ui.Notification.show(((("The requested view (" + navigationState) + ") was not available, ") + "entering default screen."), Notification.Type.WARNING_MESSAGE);
    getNavigator().navigateTo(this.viewProvider.getDefaultViewId());
    getSession().getErrorHandler().error(new com.vaadin.spring.ui.ErrorEvent(e));
}