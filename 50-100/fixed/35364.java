@java.lang.Override
public java.lang.Void visitFunction(io.crate.analyze.symbol.Function symbol, io.crate.analyze.validator.HavingSymbolValidator.HavingContext context) {
    if ((symbol.info().type()) == (FunctionInfo.Type.AGGREGATE)) {
        context.insideAggregation = true;
    }
    for (io.crate.analyze.symbol.Symbol argument : symbol.arguments()) {
        process(argument, context);
    }
    if ((symbol.info().type()) == (FunctionInfo.Type.AGGREGATE)) {
        context.insideAggregation = false;
    }
    return null;
}