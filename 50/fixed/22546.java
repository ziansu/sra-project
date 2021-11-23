public static java.lang.String decodePathSegment(java.lang.String pathSegment) throws java.io.UnsupportedEncodingException {
    if (pathSegment != null) {
        return java.net.URLDecoder.decode(pathSegment, "UTF-8");
    }else {
        return null;
    }
}