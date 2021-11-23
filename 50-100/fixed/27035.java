private java.lang.String getOrg(java.util.Map<java.lang.String, java.lang.Object> profile) {
    java.util.List<java.lang.String> map = ((java.util.List<java.lang.String>) (profile.get("summary")));
    if ((map != null) && ((map.size()) >= 1)) {
        return map.get(0).toString();
    }else {
        return "";
    }
}