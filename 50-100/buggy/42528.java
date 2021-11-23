public static void setLanguageFromSettingsOrSystem() {
    org.sammelbox.controller.i18n.Language userDefinedLanguage = org.sammelbox.controller.managers.SettingsManager.getUserDefinedLanguage();
    if (userDefinedLanguage != (Language.UNKNOWN)) {
        org.sammelbox.controller.i18n.Translator.setLanguageManually(userDefinedLanguage);
    }else {
        switch (java.lang.System.getProperty("user.language")) {
            case "de" :
                org.sammelbox.controller.i18n.Translator.setLanguageManually(Language.GERMAN);
                break;
            case "fr" :
                org.sammelbox.controller.i18n.Translator.setLanguageManually(Language.FRENCH);
            default :
                org.sammelbox.controller.i18n.Translator.setLanguageManually(Language.ENGLISH);
        }
    }
}