public <T> T macro(org.codehaus.groovy.control.CompilePhase compilePhase, java.lang.String source, final java.util.List<groovy.lang.Closure<org.codehaus.groovy.ast.expr.Expression>> context, java.lang.Class<T> resultClass) {
    return macro(compilePhase, false, source, context, resultClass);
}