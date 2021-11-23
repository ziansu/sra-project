public org.apache.base.dao.table.Select limit(int offset, int pageSize) {
    com.google.common.base.Preconditions.checkArgument((offset > 0), "param offset can not be negative.");
    com.google.common.base.Preconditions.checkArgument((pageSize > 0), "param pageSize can not be negative.");
    this.offset = offset;
    this.pageSize = pageSize;
    return this;
}