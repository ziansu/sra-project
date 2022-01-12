void onLanguageChanged(com.beeva.planningpoker.manager.language.LanguageEnum language) {
    languageManager.changeLocale(language);
    dataRepository.setAppLanguage(language);
    view.forceChangeLanguage();
}