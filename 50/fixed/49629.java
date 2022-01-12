protected com.miraisolutions.xlconnect.data.CellValue getCellValue(com.miraisolutions.xlconnect.data.Cell cell) {
    if (this.takeCached) {
        return getCachedCellValue(cell);
    }else {
        return this.evaluator.evaluate(cell);
    }
}