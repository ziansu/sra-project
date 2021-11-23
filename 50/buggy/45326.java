public java.lang.String getStatus() {
    try {
        java.lang.String s = responseMap.get("status");
        return s;
    } catch (java.lang.Exception ex) {
        return "";
    }
}