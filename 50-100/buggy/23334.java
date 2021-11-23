@java.lang.Override
public void onResponseReceived(org.bbop.apollo.gwt.client.Request request, org.bbop.apollo.gwt.client.Response response) {
    org.bbop.apollo.gwt.client.JSONValue v = org.bbop.apollo.gwt.client.JSONParser.parseStrict(response.getText());
    org.bbop.apollo.gwt.client.JSONObject o = v.isObject();
    if (o.containsKey(FeatureStringEnum.ERROR.getValue())) {
        new org.bbop.apollo.gwt.client.ErrorDialog("Error Updating User", o.get(FeatureStringEnum.ERROR.getValue()).isString().stringValue(), true, true);
    }
    com.google.gwt.core.client.GWT.log("updateGenomicViewer");
    org.bbop.apollo.gwt.client.MainPanel.updateGenomicViewer(true);
}