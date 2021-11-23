private boolean compileCode(java.lang.String code, java.lang.String className) {
    vk.core.api.CompilationUnit cu = new vk.core.api.CompilationUnit(className, code, false);
    vk.core.api.JavaStringCompiler jsc = vk.core.api.CompilerFactory.getCompiler(cu);
    jsc.compileAndRunTests();
    vk.core.api.CompilerResult cr = jsc.getCompilerResult();
    if (cr.hasCompileErrors()) {
        info = formatCompileErrors(cr, cu);
        return false;
    }
    return true;
}