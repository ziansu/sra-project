private java.util.Map findMediaTypeByName(java.lang.String name, java.util.Set<java.util.Map> mediatypes) {
    if (mediatypes == null) {
        return java.util.Collections.emptyMap();
    }
    for (java.util.Map mediatype : mediatypes) {
        if (name.equals(mediatype.get("name"))) {
            return mediatype;
        }
    }
    return java.util.Collections.emptyMap();
}