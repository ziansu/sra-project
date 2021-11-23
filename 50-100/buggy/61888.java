public void setPopup(org.apache.poi.ss.util.CellReference cellReference, com.vaadin.addon.spreadsheet.PopupButton popupButton) {
    removePopupButton(cellReference);
    if (popupButton != null) {
        popupButton.setCellReference(cellReference);
        sheetPopupButtons.put(cellReference, popupButton);
        if (isCellVisible(cellReference.getCol(), cellReference.getRow())) {
            registerCustomComponent(popupButton);
            markAsDirty();
        }
    }
}