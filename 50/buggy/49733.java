public java.util.List<de.fau.cs.mad.wanthavers.common.Category> getSubcategories(long categoryId, boolean recursive) {
    return categoryEndpoint.getSub(categoryId, recursive);
}