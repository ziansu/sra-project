protected org.talend.utils.json.JSONObject loadDefaultConfigurations() {
    org.talend.utils.json.JSONObject globalJson = org.talend.hadoop.distribution.utils.DefaultConfigurationManager.loadDefaultFile(org.talend.hadoop.distribution.AbstractDistribution.class, getDistribution().toLowerCase());
    if ((getVersion()) != null) {
        org.talend.utils.json.JSONObject versionJson = org.talend.hadoop.distribution.utils.DefaultConfigurationManager.loadDefaultFile(this.getClass(), getVersion().toLowerCase());
        return org.talend.utils.json.JSONUtil.merge(globalJson, versionJson);
    }
    return globalJson;
}