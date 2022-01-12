public static boolean isValid(java.lang.String link) {
    try {
        if (link == null)
            return false;
        
        java.net.URI uri = new java.net.URI(link);
        return (uri.getScheme().equals("http")) || (uri.getScheme().equals("https"));
    } catch (java.net.URISyntaxException e) {
        return false;
    }
}