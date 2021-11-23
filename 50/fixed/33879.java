private java.lang.String getTranslatedName(org.languagetool.Language language) {
    java.lang.String name = language.getTranslatedName(messages);
    if (language.isExternal()) {
        name += extLangSuffix;
    }
    return name;
}