private java.lang.String getField(java.util.Map<java.lang.String, java.lang.Object> profile) {
    java.util.List<java.lang.String> map = ((java.util.List<java.lang.String>) (profile.get("summary")));
    if ((map.size()) >= 2) {
        return map.get(1).toString();
    }else {
        return "";
    }
}