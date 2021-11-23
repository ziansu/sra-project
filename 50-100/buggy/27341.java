private java.lang.String getJsonString(java.util.List<java.lang.String> strings) {
    org.jitsi.videobridge.JSONArray array = new org.jitsi.videobridge.JSONArray();
    if ((strings != null) && (!(strings.isEmpty()))) {
        for (java.lang.String s : strings) {
            array.add(s);
        }
    }
    return array.toString();
}