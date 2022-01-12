public final net.sf.json.JSONObject getJSONNonPassword() {
    if ((_json) == null) {
        getJSON();
    }
    net.sf.json.JSONObject jo = net.sf.json.JSONObject.fromObject(_json);
    for (java.lang.Object name : jo.keySet()) {
        if ((("password".equals(name)) || ("pwd".equals(name))) || ("passwd".equals(name))) {
            jo.put(name, "*******");
        }
    }
    return jo;
}