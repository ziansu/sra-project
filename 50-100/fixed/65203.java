@java.lang.Override
protected void handleUiAcceptInput(org.eclipse.scout.rt.ui.html.json.JsonEvent event) {
    org.json.JSONObject data = event.getData();
    if (data.has(ISmartField2.PROP_LOOKUP_ROW)) {
        this.handleUiLookupRowChange(data);
    }else
        if (data.has(IValueField.PROP_VALUE)) {
            handleUiValueChange(data);
        }
    
    if (data.has(IValueField.PROP_DISPLAY_TEXT)) {
        this.handleUiDisplayTextChange(data);
    }
    if (data.has(IValueField.PROP_ERROR_STATUS)) {
        this.handleUiErrorStatusChange(data);
    }
}