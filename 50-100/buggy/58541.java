public java.lang.String ruleSetToString(java.util.Collection<org.jdata.timeseries.processing.Rule> rules) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (org.jdata.timeseries.processing.Rule r : rules) {
        sb.append(r.toString());
        sb.append(',');
    }
    return sb.toString();
}