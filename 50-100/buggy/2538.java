public java.lang.String fillReason() throws java.lang.Exception {
    if (hudson.plugins.claim.ClaimBuildFailureAnalyzer.isBFAEnabled()) {
        java.util.HashMap<java.lang.String, java.lang.String> map = hudson.plugins.claim.ClaimBuildFailureAnalyzer.getFillReasonMap();
        net.sf.json.JSONObject json = new net.sf.json.JSONObject();
        for (java.lang.String key : map.keySet()) {
            json.put(key, map.get(key));
        }
        java.lang.String causeMap = json.toString();
        return causeMap;
    }
    return null;
}