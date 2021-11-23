@java.lang.Override
public java.lang.String optTr(java.lang.String key, java.lang.String fallback) {
    checkTranslator();
    return translator.optTr(key, fallback);
}