public com.github.jferard.fastods.TableCell getOrCreateCell(final int colIndex) {
    com.github.jferard.fastods.TableCell cell = this.cells.get(colIndex);
    if (cell == null) {
        cell = new com.github.jferard.fastods.TableCellImpl(this.writeUtil, this.xmlUtil, this.stylesContainer, this.dataStyles, this, this.rowIndex, this.columnCapacity);
        this.cells.set(colIndex, cell);
    }
    return cell;
}