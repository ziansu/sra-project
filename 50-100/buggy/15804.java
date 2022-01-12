public long maxPagecountByTagId(long tagId, int pagesize) {
    com.google.common.base.Preconditions.checkArgument((tagId > 0L));
    com.google.common.base.Preconditions.checkArgument((pagesize > 0));
    long size = this.taDAO.sizeByTagId(tagId);
    return 1 + ((size - 1) / pagesize);
}