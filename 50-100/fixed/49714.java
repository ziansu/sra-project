public static java.lang.String normalizeDeviceName(java.lang.String deviceName) {
    if ((deviceName == null) || ((deviceName.length()) == 0))
        return "";
    
    java.lang.String[] nameParts = deviceName.split("-");
    java.lang.String consistentName = nameParts[0];
    consistentName = consistentName.toLowerCase();
    consistentName = consistentName.trim();
    consistentName = consistentName.replace(" ", "_");
    return consistentName;
}