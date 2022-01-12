@org.jetbrains.annotations.NotNull
private net.masterthought.dlanguage.highlighting.annotation.Problems findProblems(java.lang.String stdout, com.intellij.psi.PsiFile file) {
    final java.util.List<java.lang.String> lints = com.intellij.openapi.util.text.StringUtil.split(stdout, "\n");
    net.masterthought.dlanguage.highlighting.annotation.Problems problems = new net.masterthought.dlanguage.highlighting.annotation.Problems();
    for (java.lang.String lint : lints) {
        com.intellij.util.containers.ContainerUtil.addIfNotNull(problems, parseProblem(lint, file));
    }
    return problems;
}