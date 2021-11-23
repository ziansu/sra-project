@java.lang.Override
public org.eclipse.tm4e.core.grammar.IGrammar getGrammarFor(org.eclipse.core.runtime.content.IContentType[] contentTypes) {
    loadGrammarsIfNeeded();
    if (contentTypes == null) {
        return null;
    }
    for (org.eclipse.core.runtime.content.IContentType contentType : contentTypes) {
        java.lang.String scopeName = getScopeName(contentType.getId());
        if (scopeName != null) {
            org.eclipse.tm4e.core.grammar.IGrammar grammar = registry.getGrammar(scopeName);
            if (grammar != null) {
                return grammar;
            }
        }
    }
    return null;
}