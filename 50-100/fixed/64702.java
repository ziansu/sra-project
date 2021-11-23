private com.vaadin.ui.Button getButtonForViewId(java.lang.String viewId) {
    com.vaadin.ui.Button button = this.nameToButton.get(viewId);
    if (button == null) {
        java.lang.String beanName = this.viewProvider.getBeanNameOfViewName(viewId);
        java.lang.Class<?> viewClass = this.viewProvider.getTypeOfBeanName(beanName);
        com.vaadin.spring.annotation.SpringView annotation = this.viewProvider.getAnnotationOfBeanName(beanName);
        button = getButtonFor(viewClass, annotation, viewId);
        this.nameToButton.put(viewId, button);
    }
    return button;
}