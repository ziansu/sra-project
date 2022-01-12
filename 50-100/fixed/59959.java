@org.apache.tapestry5.annotations.AfterRender
public void finish() {
    org.apache.tapestry5.Link link = resources.createEventLink("getzeroclipboard");
    org.apache.tapestry5.json.JSONObject jso = new org.apache.tapestry5.json.JSONObject();
    org.apache.tapestry5.json.JSONObject params = new org.apache.tapestry5.json.JSONObject();
    params.put("swfUrl", link.toAbsoluteURI());
    jso.put("params", params);
    jso.put("id", ((type) + "-code"));
}