protected boolean isFirstGrid(java.lang.String gridName) {
    return "0".equals(gridName.substring(getTestGridName().length()));
}