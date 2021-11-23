private void InitJson() {
    java.util.Map<java.lang.String, java.lang.String> tmp = new java.util.HashMap<java.lang.String, java.lang.String>();
    tmp.put("group_id", s_group);
    tmp.put("user_id", s_member);
    tmp.put("status", s_status);
    json_properties = new org.json.JSONObject(tmp);
}