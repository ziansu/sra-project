public org.json.JSONObject getClassInfo(java.lang.String school, java.lang.String sClass, int week) {
    return classApiCall(((((("/" + school) + "/class/") + sClass) + "/") + week));
}