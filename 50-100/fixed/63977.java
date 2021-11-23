private void doCheckResult(@org.jetbrains.annotations.NotNull
java.lang.String relativePath, @org.jetbrains.annotations.NotNull
java.lang.String before, @org.jetbrains.annotations.NotNull
java.lang.String after, @org.jetbrains.annotations.Nullable
java.lang.Character c) {
    com.intellij.psi.PsiFile testFile = myFixture.addFileToProject(relativePath, before);
    myFixture.configureFromExistingVirtualFile(testFile.getVirtualFile());
    myFixture.completeBasic();
    if (c != null) {
        myFixture.type(c);
    }
    myFixture.checkResult(after);
}