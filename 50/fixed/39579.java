@java.lang.Override
protected void updateAjaxAttributes(org.apache.wicket.ajax.attributes.AjaxRequestAttributes attributes) {
    if (settings.isPreventDoubleClickForFormSubmit()) {
        org.apache.isis.viewer.wicket.ui.panels.PanelUtil.disableBeforeReenableOnComplete(attributes, this);
    }
}