@org.jetbrains.annotations.Nullable
public static com.intellij.debugger.engine.JVMName getContextClassJVMQualifiedName(@org.jetbrains.annotations.Nullable
com.intellij.debugger.SourcePosition pos) {
    final com.intellij.debugger.engine.PsiClass psiClass = com.intellij.debugger.engine.JVMNameUtil.getClassAt(pos);
    if (psiClass == null) {
        return null;
    }
    if (!(com.intellij.psi.util.PsiUtil.isLocalOrAnonymousClass(psiClass))) {
        final java.lang.String name = com.intellij.debugger.engine.JVMNameUtil.getNonAnonymousClassName(psiClass);
        if (name != null) {
            return com.intellij.debugger.engine.JVMNameUtil.getJVMRawText(name);
        }
    }
    return new com.intellij.debugger.engine.JVMNameUtil.JVMClassAt(pos);
}