@org.jetbrains.annotations.Nullable
protected com.intellij.lang.Language getScriptLanguage() {
    java.util.Collection<com.intellij.lang.Language> instancesByMimeType = com.intellij.lang.Language.findInstancesByMimeType(((scriptType) != null ? scriptType.trim() : null));
    com.intellij.lang.Language language = (instancesByMimeType.isEmpty()) ? null : instancesByMimeType.iterator().next();
    if (language == null)
        language = com.intellij.lang.javascript.JavascriptLanguage.INSTANCE;
    
    return language;
}