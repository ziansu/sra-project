private boolean isViewNameValidForCurrentUI(java.lang.String viewName) {
    final java.util.Set<java.lang.String> beanNames = this.viewNameToBeanNamesMap.get(viewName);
    if (beanNames != null) {
        for (java.lang.String beanName : beanNames) {
            if (isViewBeanNameValidForCurrentUI(beanName)) {
                return ((getAccessDeniedView()) != null) || (isAccessGrantedToBeanName(beanName));
            }
        }
    }
    return false;
}