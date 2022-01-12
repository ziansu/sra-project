public <T extends org.roda.core.data.v2.index.IsIndexed> org.roda.core.index.utils.IterableIndexResult<T> findAll(final java.lang.Class<T> returnClass, final org.roda.core.data.v2.index.filter.Filter filter, final org.roda.core.data.v2.index.sort.Sorter sorter, final boolean removeDuplicates, final java.util.List<java.lang.String> fieldsToReturn) {
    return findAll(returnClass, filter, sorter, Sublist.ALL, null, true, removeDuplicates, fieldsToReturn);
}