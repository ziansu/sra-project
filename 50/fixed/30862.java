public com.intellij.psi.codeStyle.CodeStyleScheme exportProjectScheme(@org.jetbrains.annotations.NotNull
java.lang.String name) {
    com.intellij.psi.codeStyle.CodeStyleScheme newScheme = createNewScheme(name, myProjectScheme);
    ((com.intellij.psi.impl.source.codeStyle.CodeStyleSchemeImpl) (newScheme)).setCodeStyleSettings(getCloneSettings(myProjectScheme));
    addScheme(newScheme, false);
    return newScheme;
}