private int getType(org.json.simple.JSONObject j) {
    int ret = ((int) ((long) (j.get("type"))));
    java.lang.System.out.println(ret);
    return ret;
}