public void hideIndex(java.lang.String dataElement) {
    if ((hiddenDataElementRows) == null) {
        hiddenDataElementRows = new java.util.HashMap<>();
    }
    if (dataElement != null) {
        hiddenDataElementRows.put(dataElement, true);
    }
}