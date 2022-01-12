public void putSpecs(com.sun.tools.javac.code.Symbol.MethodSymbol m, org.jmlspecs.openjml.JmlSpecs.MethodSpecs spec) {
    if ((utils.jmlverbose) >= (Utils.JMLDEBUG))
        log.getWriter(WriterKind.NOTICE).println(((("            Saving method specs for " + (m.enclClass())) + " ") + m));
    
    getSpecs(m.enclClass()).methods.put(m, spec);
}