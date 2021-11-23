protected edu.brandeis.cs.nlp.mae.model.ExtentTag createTag(java.lang.String tid, edu.brandeis.cs.nlp.mae.model.TagType tagType, java.lang.String text, int[] spans) throws java.sql.SQLException {
    edu.brandeis.cs.nlp.mae.model.ExtentTag tag = new edu.brandeis.cs.nlp.mae.model.ExtentTag(tid, tagType);
    for (edu.brandeis.cs.nlp.mae.model.CharIndex ci : tag.setSpans(spans)) {
        charIndexDao.create(ci);
    }
    tag.setText(text);
    eTagDao.create(tag);
    return tag;
}