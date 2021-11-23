private java.lang.String formatTag(java.lang.String tag) {
    if ((tag.subSequence(0, 0)) != "#") {
        tag = "#" + tag;
    }
    return tag;
}