@java.lang.Override
public java.lang.String searchTag() {
    java.lang.String tag = inner.searchTag();
    if (tag != null) {
        tagFix = true;
        return tag;
    }
    tagFix = false;
    return null;
}