private com.vaadin.ui.Button getButtonForViewId(java.lang.String viewId) {
    com.vaadin.ui.Button button = nameToButton.get(viewId);
    if (button == null) {
        java.lang.String beanName = viewProvider.getBeanNameOfViewName(viewId);
        java.lang.Class<?> viewClass = viewProvider.getTypeOfBeanName(beanName);
        com.vaadin.spring.annotation.SpringView annotation = viewProvider.getAnnotationOfBeanName(beanName);
        button = getButtonFor(viewClass, annotation, viewId);
        nameToButton.put(viewId, button);
    }
    return button;
}