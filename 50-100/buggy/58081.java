protected void clearSheetServerSide() {
    workbook = null;
    styler = null;
    valueManager.clearCachedContent();
    selectionManager.clear();
    customComponentFactory = null;
    historyManager.clear();
    hyperlinkCellClickHandler = null;
    for (com.vaadin.addon.spreadsheet.SheetImageWrapper image : sheetImages) {
        setResource(image.resourceKey, null);
    }
    sheetImages.clear();
}