public org.springframework.ui.ModelMap getModel() {
    if (useDefaultModel()) {
        return this.defaultModel;
    }else {
        if ((this.redirectModel) == null) {
            this.redirectModel = new org.springframework.ui.ModelMap();
        }
        return this.redirectModel;
    }
}