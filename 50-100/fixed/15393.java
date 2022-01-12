static java.lang.String getDisplayBackgroundColor(java.lang.String settings) {
    if ((settings.contains("<bgc=")) && (settings.contains(">"))) {
        return settings.substring(((settings.indexOf("<bgc=")) + 5), settings.indexOf(">", settings.indexOf("<bgc="))).replace("0x", "");
    }
    return "40000000";
}