public void addSerializeFilter(com.alibaba.fastjson.serializer.SerializeFilter filter) {
    if (filter == null) {
        return ;
    }
    com.alibaba.fastjson.serializer.SerializeFilter[] filters = new com.alibaba.fastjson.serializer.SerializeFilter[(this.filters.length) + 1];
    java.lang.System.arraycopy(this.filters, 0, filters, 0, this.filters.length);
    filters[((filters.length) - 1)] = filter;
    this.filters = filters;
}