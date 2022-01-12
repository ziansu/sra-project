private void push(java.util.List<net.abstractfactory.plum.integration.web.ViewChange> viewChanges) {
    org.json.JSONArray jsonArray = new org.json.JSONArray();
    for (net.abstractfactory.plum.integration.web.ViewChange vc : viewChanges) {
        jsonArray.put(vc.toJson());
    }
    java.lang.String json = jsonArray.toString();
    getPushService().push(pushTopic, json);
}