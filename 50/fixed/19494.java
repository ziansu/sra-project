public java.lang.String getDefaultViewId() {
    for (java.lang.String viewName : this.defaultViewNames) {
        if (isViewNameValidForCurrentUI(viewName)) {
            return viewName;
        }
    }
    return null;
}