private void reserve(int col) {
    if (col >= (cells.size())) {
        com.dua3.meja.model.generic.GenericCellStyle cellStyle = getSheet().getWorkbook().getDefaultCellStyle();
        for (int colNum = cells.size(); colNum <= col; colNum++) {
            cells.add(new com.dua3.meja.model.generic.GenericCell(this, colNum, cellStyle));
        }
        sheet.reserveColumn(col);
    }
}