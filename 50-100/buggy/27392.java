public java.lang.String translate(java.lang.String key) {
    final java.lang.String translation = this.translations.get(key);
    return (translation == null) || (translation.isEmpty()) ? (type) != (LanguageType.ENGLISH) ? I18n.ENGLISH.translate(key) : key : translation;
}