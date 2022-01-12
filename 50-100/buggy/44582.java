public org.python.pydev.core.IDefinition[] getDefinitions(org.python.pydev.core.IPythonNature nature, org.python.pydev.core.ICompletionCache completionCache) throws java.lang.Exception {
    if (useActualDefinitionCache) {
        return definitionCache;
    }
    useActualDefinitionCache = true;
    definitionCache = this.mod.findDefinition(org.python.pydev.editor.codecompletion.revisited.CompletionStateFactory.getEmptyCompletionState(this.rep, nature, completionCache), (-1), (-1), nature);
    return definitionCache;
}