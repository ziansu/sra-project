private de.tobiyas.racesandclasses.translation.Translator trySTDTranslate(java.lang.String tag) throws de.tobiyas.racesandclasses.translation.exception.TranslationNotFoundException {
    java.lang.String translation = de.tobiyas.racesandclasses.translation.DefaultTranslationManager.readFromYAMLList(stdLanguageFiles, tag);
    if ("".equals(translation)) {
        throw new de.tobiyas.racesandclasses.translation.exception.TranslationNotFoundException(stdLanguage, tag);
    }else {
        return new de.tobiyas.racesandclasses.translation.Translator(translation);
    }
}