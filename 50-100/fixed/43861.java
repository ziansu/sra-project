public void loadTranslation(java.lang.String text) {
    currentTranslation = null;
    getTranslationUseCase.clearDisposableObservers();
    showLoading(false);
    showError(false);
    showDictionaryTranslationCard(false);
    if (!(text.isEmpty())) {
        showLoading(true);
        getTranslationUseCase.execute(new com.example.kolin.testya.veiw.translator.TranslatorPresenter.GetTranslationObserver(), GetTranslation.TranslationParams.getParamsObj(text, generateLangString(this.langFrom.getCode(), this.langTo.getCode())));
    }
}