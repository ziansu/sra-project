@java.lang.Override
public void onResponseReceived(org.bbop.apollo.gwt.client.Request request, org.bbop.apollo.gwt.client.Response response) {
    org.bbop.apollo.gwt.client.JSONValue returnValue = org.bbop.apollo.gwt.client.JSONParser.parseLenient(response.getText());
    org.bbop.apollo.gwt.client.JSONObject returnValueObject = returnValue.isObject();
    org.bbop.apollo.gwt.client.TrackPanel.updateTracks(returnValueObject.get("tracks").isArray());
}