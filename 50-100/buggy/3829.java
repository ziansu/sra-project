@java.lang.Override
public void mipsTranslate(AST.SymbolTable table, java.lang.String fileName, AST.CodeGenarator genarator) {
    COUNTERS.TEMP varTemp = var.calcAddress(table, genarator, fileName);
    COUNTERS.TEMP expTemp = exp.calcAddress(table, genarator, fileName);
    AST.CodeGenarator.printSWCommand(expTemp.name, varTemp.name, 0);
}