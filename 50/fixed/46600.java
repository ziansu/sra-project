private com.vaadin.navigator.View getViewFromApplicationContextAndCheckAccess(java.lang.String beanName) {
    final com.vaadin.navigator.View view = ((com.vaadin.navigator.View) (this.applicationContext.getBean(beanName)));
    if (isAccessGrantedToViewInstance(beanName, view)) {
        return view;
    }else {
        return null;
    }
}