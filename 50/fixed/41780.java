protected boolean isFirstGrid(java.lang.String gridName) {
    return (gridName.startsWith(getTestGridName())) && ("0".equals(gridName.substring(getTestGridName().length())));
}