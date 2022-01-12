public java.lang.String fillReason() throws java.lang.Exception {
    net.sf.json.JSONObject json = new net.sf.json.JSONObject();
    if (hudson.plugins.claim.ClaimBuildFailureAnalyzer.isBFAEnabled()) {
        java.util.HashMap<java.lang.String, java.lang.String> map = hudson.plugins.claim.ClaimBuildFailureAnalyzer.getFillReasonMap();
        for (java.lang.String key : map.keySet()) {
            json.put(key, map.get(key));
        }
    }
    return json.toString();
}