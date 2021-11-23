protected com.miraisolutions.xlconnect.data.CellValue getCellValue(com.miraisolutions.xlconnect.data.Cell cell) {
    if (this.takeCached) {
        return getCachedCellValue(cell);
    }else {
        this.evaluator.evaluateFormulaCell(cell);
        return this.evaluator.evaluate(cell);
    }
}