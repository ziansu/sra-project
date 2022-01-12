public llvm.LlvmValue visit(llvm.MainClass n) {
    java.lang.System.err.println(("SymTab Visit: " + (n.getClass().getName())));
    classes.put(n.className.s, new llvm.ClassNode(n.className.s, null, null, null));
    return null;
}