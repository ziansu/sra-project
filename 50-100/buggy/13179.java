@java.lang.Override
public void onCellValueChange(com.vaadin.addon.spreadsheet.Spreadsheet.CellValueChangeEvent event) {
    for (org.apache.poi.ss.util.CellReference cellRef : event.getChangedCells()) {
        org.apache.poi.ss.usermodel.Cell cell = spreadsheet.getCell(cellRef);
        if (cell == null) {
            return ;
        }
        java.lang.Object value = getCellValue(cell);
        int cellType = cell.getCellType();
        org.vaadin.artur.multiuserspreadsheet.MasterState.setCellValue(cellRef.getRow(), cellRef.getCol(), cellType, value);
    }
}