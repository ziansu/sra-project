public int removePage(java.lang.String diagramName) {
    final int pangeIndex = getPageIndex(diagramName);
    if (pangeIndex < 0) {
        return -1;
    }
    removePage(pangeIndex);
    return pangeIndex;
}