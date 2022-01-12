protected void clearSheetServerSide() {
    workbook = null;
    styler = null;
    valueManager.clearCachedContent();
    selectionManager.clear();
    historyManager.clear();
    for (com.vaadin.addon.spreadsheet.SheetImageWrapper image : sheetImages) {
        setResource(image.resourceKey, null);
    }
    sheetImages.clear();
}