@java.lang.Override
public edu.nyu.cascade.ir.pass.IRAliasAnalyzer<?> buildPreprocessor(edu.nyu.cascade.ir.SymbolTable symbolTable) {
    edu.nyu.cascade.ir.pass.IRAliasAnalyzer<?> preProcessor = edu.nyu.cascade.c.pass.alias.steens.Steensgaard.create(symbolTable);
    return preProcessor;
}