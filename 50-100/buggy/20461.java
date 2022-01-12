public boolean equals(java.lang.Object o) {
    if (o == null) {
        return false;
    }
    com.boun.http.request.TagData d = ((com.boun.http.request.TagData) (o));
    return (d.getTag().equalsIgnoreCase(getTag())) && (d.getClazz().equalsIgnoreCase(getClazz()));
}