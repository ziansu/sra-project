public static synchronized com.ibm.icu.text.Transliterator get(java.lang.String rules) {
    com.ibm.icu.text.Transliterator result = com.hughes.android.dictionary.engine.TransliteratorManager.cache.get(rules);
    if (result == null) {
        result = com.ibm.icu.text.Transliterator.createFromRules("", rules, Transliterator.FORWARD);
        com.hughes.android.dictionary.engine.TransliteratorManager.cache.put(rules, result);
    }
    return result;
}