public fr.insalyon.citi.golo.compiler.ir.GoloModule expand(fr.insalyon.citi.golo.compiler.ir.GoloModule goloModule) {
    goloModule.accept(new fr.insalyon.citi.golo.compiler.QuotedIrExpander());
    goloModule.accept(new fr.insalyon.citi.golo.compiler.MacroExpansionIrVisitor(true));
    return goloModule;
}