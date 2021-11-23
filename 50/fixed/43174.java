@java.lang.Override
public int searchTag() {
    int tag = inner.searchTag();
    if (tag != (-1)) {
        tagFix[tag] = true;
        return tag;
    }
    return -1;
}