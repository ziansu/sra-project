private void doCheckResult(@org.jetbrains.annotations.NotNull
java.lang.String relativePath, @org.jetbrains.annotations.NotNull
java.lang.String before, @org.jetbrains.annotations.NotNull
java.lang.String after, @org.jetbrains.annotations.Nullable
java.lang.Character c) {
    com.intellij.psi.PsiFile testFile = myFixture.addFileToProject("org/test/file1.bal", before);
    myFixture.configureFromExistingVirtualFile(testFile.getVirtualFile());
    myFixture.completeBasic();
    if (c != null) {
        myFixture.type(c);
    }
    myFixture.checkResult(after);
}