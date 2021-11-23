private boolean isAccessGrantedToViewInstance(java.lang.String beanName, com.vaadin.navigator.View view) {
    final com.vaadin.ui.UI currentUI = com.vaadin.ui.UI.getCurrent();
    final java.util.Map<java.lang.String, com.vaadin.spring.access.ViewInstanceAccessControl> accessDelegates = applicationContext.getBeansOfType(com.vaadin.spring.access.ViewInstanceAccessControl.class);
    for (com.vaadin.spring.access.ViewInstanceAccessControl accessDelegate : accessDelegates.values()) {
        if (!(accessDelegate.isAccessGranted(currentUI, beanName, view))) {
            com.vaadin.spring.navigator.SpringViewProvider.LOGGER.debug("Access delegate [{}] denied access to view [{}]", accessDelegate, view);
            return false;
        }
    }
    return true;
}