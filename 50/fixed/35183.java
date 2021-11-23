private com.vaadin.navigator.View getAccessDeniedView() {
    if ((this.accessDeniedViewClass) != null) {
        return this.applicationContext.getBean(this.accessDeniedViewClass);
    }else {
        return null;
    }
}