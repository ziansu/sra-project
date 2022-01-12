public java.lang.String getTranslation(edu.ycp.coady.translator.models.TranslationComponents components) {
    java.lang.String translation = "";
    java.lang.String dict = determineDict(components.getSourceLanguage(), components.getTargetLanguage());
    java.util.ArrayList<java.lang.String> words = splitText(components.getSourceText());
    for (java.lang.String word : words) {
        translation = translation.concat(((lookUpWord(dict, word)) + " "));
    }
    return translation;
}