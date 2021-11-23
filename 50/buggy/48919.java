void show(final org.wheatgenetics.coordinate.ui.TemplateModel templateModel) {
    if (null != templateModel) {
        this.templateModel = templateModel;
        this.makeConfiguredTrue();
        this.show();
    }
}