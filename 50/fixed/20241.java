private static java.lang.String escapeAmpersand(java.lang.String url) {
    if ((url != null) && (config.OS.equals("windows")))
        url = url.replaceAll("&", "^^^&");
    
    return url;
}