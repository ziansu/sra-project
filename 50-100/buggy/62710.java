public java.lang.String tagToString() {
    java.lang.String tag = "";
    for (int i = 0; i < (tags.size()); i++) {
        tag += (tags.get(i).getTagsName()) + ",";
    }
    return tag;
}