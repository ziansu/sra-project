@java.lang.SuppressWarnings(value = "unused")
public static com.intellij.psi.util.PsiClass findNonQualifiedClassByIndex(@org.jetbrains.annotations.NotNull
java.lang.String indexName, @org.jetbrains.annotations.NotNull
com.intellij.psi.util.PsiClass containingClass) {
    return com.intellij.psi.util.ClassUtil.findNonQualifiedClassByIndex(indexName, containingClass, false);
}