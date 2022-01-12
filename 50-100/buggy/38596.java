public static java.lang.String create(nl.sjtek.sjtekcontrol.modules.BaseModule... modules) {
    org.json.JSONObject jsonObject = new org.json.JSONObject();
    for (nl.sjtek.sjtekcontrol.modules.BaseModule module : modules) {
        jsonObject.put(module.getClass().getSimpleName().toLowerCase(), module.toJson());
    }
    return jsonObject.toString(2);
}