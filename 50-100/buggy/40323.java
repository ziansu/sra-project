private static java.lang.String translate(java.lang.String s) {
    com.ibm.watson.developer_cloud.language_translator.v2.model.TranslationResult translationResult = com.ml.langtranslator.Translator.service.translate("hello", Language.ENGLISH, Language.SPANISH).execute();
    if ((translationResult.getFirstTranslation()) != null) {
        return translationResult.getFirstTranslation();
    }else {
        java.lang.System.out.println("Got null result.");
        return "Sorry, I did not understand.";
    }
}