@java.lang.Override
public void mipsTranslate(AST.SymbolTable table, java.lang.String assemblyFileName, AST.CodeGenarator genartor) {
    table.insertASTNode(this);
    if ((exp) != null) {
        int sizeToAllocateForThisStmt = 4;
        AST.CodeGenarator.allocateMemory(sizeToAllocateForThisStmt);
        IR.TEMP rvalue = exp.calcAddress(table, genartor, assemblyFileName);
        AST.CodeGenarator.printSWInFpPlusOffset(rvalue);
    }
}