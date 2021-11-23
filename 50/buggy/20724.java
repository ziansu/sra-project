public org.json.JSONObject createBandwidthLimitRulePayload(java.lang.String max_rate) {
    org.json.JSONObject tmp = new org.json.JSONObject((("{\"bandwidth_limit_rule\":{\"max_kbps\":\"" + max_rate) + "\"}}"));
    logger.debug(("Created bandwidth_limit_rule payload : " + (tmp.toString())));
    return tmp;
}