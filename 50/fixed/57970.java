private int getType(org.json.simple.JSONObject j) {
    int ret = ((int) ((long) (j.get("type"))));
    return ret;
}