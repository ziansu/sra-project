private static java.lang.String fullUserMessage(@org.jetbrains.annotations.NotNull
java.lang.String userMessage, @org.jetbrains.annotations.NotNull
com.intellij.psi.PsiFile containingFile, @org.jetbrains.annotations.NotNull
com.intellij.psi.PsiElement element) {
    return (((userMessage + "\n") + (org.elixir_lang.errorreport.Logger.excerpt(containingFile, element))) + "\n") + (org.elixir_lang.errorreport.Logger.className(element));
}