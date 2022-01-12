@java.lang.Override
public com.vaadin.navigator.View getView(java.lang.String viewName) {
    final java.util.Set<java.lang.String> beanNames = this.viewNameToBeanNamesMap.get(viewName);
    if (beanNames != null) {
        for (java.lang.String beanName : beanNames) {
            if (isViewBeanNameValidForCurrentUI(beanName)) {
                return getViewFromApplicationContext(viewName, beanName);
            }
        }
    }
    com.vaadin.spring.navigator.SpringViewProvider.LOGGER.warn("Found no view with name [{}]", viewName);
    return null;
}