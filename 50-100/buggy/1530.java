protected java.lang.Object M() throws project2.compiler.CompileException {
    java.lang.Object a = F();
    if (expect(TokenType.MODULO)) {
        java.lang.Object b = M();
        if ((!(a instanceof java.lang.Double)) || (!(b instanceof java.lang.Double)))
            onError("M1: invalid MODULO on non-doubles");
        
        return ((double) (a)) * ((double) (b));
    }
    return a;
}