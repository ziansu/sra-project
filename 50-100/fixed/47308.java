public java.lang.String tranlate(java.lang.String word) {
    java.lang.String translation = CACHE.getTranslation(word);
    if (isTesting) {
        translation = null;
    }
    if (translation != null) {
        updateCount(word);
        return translation;
    }
    translation = CLIENT.translate(word);
    if ((translation != null) && (!(translation.isEmpty()))) {
        updateCount(word);
        CACHE.updateTranslation(word, translation);
        return translation;
    }
    return WORD_NOT_FOUND;
}