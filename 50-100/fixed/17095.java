private java.util.List<io.crate.analyze.symbol.Symbol> buildOutputSymbols() {
    java.util.List<io.crate.analyze.symbol.Symbol> outputSymbols = new java.util.ArrayList<>(2);
    io.crate.analyze.symbol.InputColumn inputColumn = new io.crate.analyze.symbol.InputColumn(0);
    io.crate.operation.projectors.ReferenceIdent referenceIdent = new io.crate.operation.projectors.ReferenceIdent(io.crate.operation.projectors.FetchProjectorTest.USER_TABLE_IDENT, "id");
    io.crate.operation.projectors.ReferenceInfo referenceInfo = new io.crate.operation.projectors.ReferenceInfo(referenceIdent, RowGranularity.DOC, io.crate.types.LongType.INSTANCE, io.crate.metadata.table.ColumnPolicy.STRICT, ReferenceInfo.IndexType.NOT_ANALYZED, true);
    outputSymbols.add(new io.crate.analyze.symbol.FetchReference(inputColumn, new io.crate.analyze.symbol.Reference(referenceInfo)));
    return outputSymbols;
}