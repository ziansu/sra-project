public co.cask.cdap.data2.metadata.dataset.SearchResults search(java.lang.String namespaceId, java.lang.String searchQuery, java.util.Set<co.cask.cdap.proto.element.EntityTypeSimpleName> types, co.cask.cdap.data2.metadata.dataset.SortInfo sortInfo, int offset, int limit, int numCursors, @javax.annotation.Nullable
java.lang.String cursor, boolean showHidden) {
    if (SortInfo.DEFAULT.equals(sortInfo)) {
        return searchByDefaultIndex(namespaceId, searchQuery, types, showHidden);
    }
    return searchByCustomIndex(namespaceId, types, sortInfo, offset, limit, numCursors, cursor, showHidden);
}