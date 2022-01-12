public java.lang.String tag(final java.lang.String word, java.lang.String posTag) {
    java.util.List<morfologik.stemming.WordData> wdList = dictLookup.lookup(word.toLowerCase());
    java.lang.String newPosTag = null;
    for (morfologik.stemming.WordData wd : wdList) {
        newPosTag = wd.getTag().toString();
    }
    if (newPosTag == null) {
        newPosTag = posTag;
    }
    return newPosTag;
}