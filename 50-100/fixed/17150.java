@java.lang.Override
protected void onResponse(final org.opencms.ade.contenteditor.shared.CmsContentDefinition result) {
    if (result.isModelInfo()) {
        stop(false);
        callback.execute(result);
    }else {
        registerContentDefinition(result);
        org.opencms.ade.contenteditor.widgetregistry.client.WidgetRegistry.getInstance().registerExternalWidgets(result.getExternalWidgetConfigurations(), new com.google.gwt.user.client.Command() {
            public void execute() {
                stop(false);
                callback.execute(result);
            }
        });
    }
}