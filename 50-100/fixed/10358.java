public net.masterthought.dlanguage.highlighting.annotation.Problems checkFileSyntax(@org.jetbrains.annotations.NotNull
com.intellij.psi.PsiFile file) {
    final java.lang.String dubPath = ToolKey.DUB_KEY.getPath(file.getProject());
    if (dubPath == null)
        return new net.masterthought.dlanguage.highlighting.annotation.Problems();
    
    java.lang.String result = processFile(file, dubPath);
    return findProblems(result, file);
}