public java.util.Map<java.lang.String, java.lang.Object> Request(java.util.Map<java.lang.String, java.lang.Object> map) throws java.io.IOException, org.json.JSONException {
    java.lang.String req = this.MsgPack(map);
    java.lang.String resp = this.Post(req);
    java.lang.System.out.println(resp);
    org.json.JSONObject json = new org.json.JSONObject(resp);
    return this.toMap(json);
}