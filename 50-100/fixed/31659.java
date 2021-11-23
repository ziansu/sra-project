public static com.intellij.debugger.engine.JVMName getJVMQualifiedName(com.intellij.debugger.engine.PsiClass psiClass) {
    final java.lang.String name = com.intellij.debugger.engine.JVMNameUtil.getNonAnonymousClassName(psiClass);
    if (name != null) {
        return com.intellij.debugger.engine.JVMNameUtil.getJVMRawText(name);
    }else {
        return new com.intellij.debugger.engine.JVMNameUtil.JVMClassAt(com.intellij.debugger.SourcePosition.createFromElement(psiClass));
    }
}