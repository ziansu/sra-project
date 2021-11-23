public com.hit.memoryunits.Page<byte[]>[] getPages(java.lang.Long[] pageIds) {
    @java.lang.SuppressWarnings(value = "unchecked")
    com.hit.memoryunits.Page<byte[]>[] retPages = new com.hit.memoryunits.Page[pageIds.length];
    int index = 0;
    for (java.lang.Long pageId : pageIds) {
        if (m_pagesMap.containsKey(pageId)) {
            retPages[index] = m_pagesMap.get(pageId);
            index++;
        }
    }
    return retPages;
}