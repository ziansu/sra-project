public com.intellij.psi.codeStyle.CodeStyleScheme exportProjectScheme(final java.lang.String name) {
    com.intellij.psi.codeStyle.CodeStyleScheme newScheme = createNewScheme(name, myProjectScheme);
    ((com.intellij.psi.impl.source.codeStyle.CodeStyleSchemeImpl) (newScheme)).setCodeStyleSettings(getCloneSettings(myProjectScheme));
    addScheme(newScheme, false);
    return newScheme;
}