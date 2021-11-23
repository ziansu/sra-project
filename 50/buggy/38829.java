public void startTranslator() {
    translator = new com.marginallyclever.makelangelo.MultilingualSupport();
    if (translator.isThisTheFirstTimeLoadingLanguageFiles()) {
        translator.chooseLanguage();
    }
}