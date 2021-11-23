private java.lang.String getTranslatedName(org.languagetool.Language language) {
    if (language.isExternal()) {
        return (language.getName()) + (extLangSuffix);
    }else {
        return language.getTranslatedName(messages);
    }
}