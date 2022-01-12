private de.tobiyas.racesandclasses.translation.Translator tryPreferedTranslate(java.lang.String tag) throws de.tobiyas.racesandclasses.translation.exception.TranslationNotFoundException {
    java.lang.String translation = de.tobiyas.racesandclasses.translation.DefaultTranslationManager.readFromYAMLList(languageConfiguration, tag);
    if ("".equals(translation)) {
        throw new de.tobiyas.racesandclasses.translation.exception.TranslationNotFoundException(getCurrentLanguage(), tag);
    }else {
        return new de.tobiyas.racesandclasses.translation.Translator(translation);
    }
}