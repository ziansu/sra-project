@java.lang.Override
public void createFunction(com.oracle.truffle.llvm.runtime.types.FunctionType type, boolean isPrototype, com.oracle.truffle.llvm.parser.model.attributes.AttributesCodeEntry paramAttr) {
    if (isPrototype) {
        final com.oracle.truffle.llvm.parser.model.functions.FunctionDeclaration function = new com.oracle.truffle.llvm.parser.model.functions.FunctionDeclaration(type, paramAttr);
        symbols.addSymbol(function);
        declares.add(function);
    }else {
        final com.oracle.truffle.llvm.parser.model.functions.FunctionDefinition method = new com.oracle.truffle.llvm.parser.model.functions.FunctionDefinition(type, metadata.instantiate(), paramAttr);
        symbols.addSymbol(method);
        defines.add(method);
    }
}