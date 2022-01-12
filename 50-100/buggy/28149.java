public llvm.LlvmValue visit(llvm.Formal n) {
    java.lang.System.err.println(("SymTab Visit: " + (n.getClass().getName())));
    llvm.LlvmValue type = n.type.accept(this);
    llvm.LlvmValue name = n.name.accept(this);
    llvm.LlvmNamedValue formal = new llvm.LlvmNamedValue(("%" + (n.name.toString())), type.type);
    return formal;
}