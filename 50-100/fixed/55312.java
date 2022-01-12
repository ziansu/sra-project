private void construct(java.lang.String key, java.lang.String value) {
    if (translations.containsKey(key)) {
        java.lang.String currentValue = translations.get(key);
        currentValue += ", ";
        currentValue += value;
        translations.put(key, currentValue);
    }
    translations.put(key, value);
}