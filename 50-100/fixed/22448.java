public org.mm.renderer.internal.Value<?> resolve(org.mm.renderer.internal.CellAddress cellAddress, org.mm.directive.ReferenceDirectives directives) {
    try {
        this.cellAddress = cellAddress;
        java.lang.String cellValue = getCellValue(cellAddress);
        cellValue = processCellShifting(cellValue, directives);
        cellValue = processEmptyValue(cellValue, directives);
        return processReferenceType(cellValue, directives);
    } catch (java.lang.RuntimeException e) {
        supplyErrorLocation(e, cellAddress);
        throw e;
    }
}