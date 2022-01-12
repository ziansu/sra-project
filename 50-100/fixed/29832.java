public static boolean isAbsoluteUrl(java.lang.String ref) {
    return ((((ref != null) && (ref.startsWith("http:"))) || (ref.startsWith("https:"))) || (ref.startsWith("urn:uuid:"))) || (ref.startsWith("urn:oid:"));
}