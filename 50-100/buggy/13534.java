private java.util.Set<java.lang.String> processTagsString(java.lang.String tags) {
    java.util.Set<java.lang.String> tagSet = new java.util.HashSet<java.lang.String>();
    java.lang.String[] tagStrings = tags.split(",");
    for (java.lang.String tagString : tagStrings) {
        tagSet.add(tagString.trim());
    }
    return tagSet;
}