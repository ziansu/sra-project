private void fillRendererCells(com.itextpdf.layout.renderer.TableRenderer renderer, byte region) {
    for (int row = 0; row < (renderer.rows.size()); row++) {
        for (int col = 0; col < (numberOfColumns); col++) {
            com.itextpdf.layout.renderer.CellRenderer cell = renderer.rows.get(row)[col];
            if (cell != null) {
                cells.add(new com.itextpdf.layout.renderer.TableWidths.CellInfo(cell, row, col, region));
            }
        }
    }
}