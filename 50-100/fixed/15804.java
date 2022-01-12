public int maxPagecountByTagId(long tagId, int pagesize) {
    com.google.common.base.Preconditions.checkArgument((tagId > 0L));
    com.google.common.base.Preconditions.checkArgument((pagesize > 0));
    java.lang.Long size = this.taDAO.sizeByTagId(tagId);
    return 1 + (((size.intValue()) - 1) / pagesize);
}