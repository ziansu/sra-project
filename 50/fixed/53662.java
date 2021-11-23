public org.json.JSONObject createPolicyUpdatePayload(java.lang.String id) {
    org.json.JSONObject tmp = new org.json.JSONObject((("{\"port\":{\"qos_policy_id\":\"" + id) + "\"}}"));
    return tmp;
}