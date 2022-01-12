public static java.lang.String[] decodePathSegments(java.lang.String path) {
    java.lang.String[] result = path.substring(1).split("/");
    for (int i = 0; i < (result.length); i++) {
        result[i] = rosa.iiif.image.core.UriUtil.decodePathSegment(result[i]);
    }
    return result;
}