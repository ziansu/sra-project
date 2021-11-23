private boolean isAccessGrantedToBeanName(java.lang.String beanName) {
    final com.vaadin.ui.UI currentUI = com.vaadin.ui.UI.getCurrent();
    final java.util.Map<java.lang.String, com.vaadin.spring.access.ViewAccessControl> accessDelegates = applicationContext.getBeansOfType(com.vaadin.spring.access.ViewAccessControl.class);
    for (com.vaadin.spring.access.ViewAccessControl accessDelegate : accessDelegates.values()) {
        if (!(accessDelegate.isAccessGranted(currentUI, beanName))) {
            com.vaadin.spring.navigator.SpringViewProvider.LOGGER.debug("Access delegate [{}] denied access to view with bean name [{}]", accessDelegate, beanName);
            return false;
        }
    }
    return true;
}