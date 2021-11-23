@java.lang.Override
public java.lang.String optTr(java.lang.String key, java.lang.String fallback) {
    return (translator) != null ? translator.optTr(key, fallback) : fallback;
}