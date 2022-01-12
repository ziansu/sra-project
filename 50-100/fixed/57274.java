private java.lang.String getPlace(java.util.Map<java.lang.String, java.lang.Object> profile) {
    java.util.List<java.lang.String> map = ((java.util.List<java.lang.String>) (profile.get("summary")));
    if ((map != null) && ((map.size()) >= 3)) {
        return map.get(2).toString();
    }else {
        return "";
    }
}