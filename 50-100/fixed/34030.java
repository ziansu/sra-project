private void publishNextTranslation() {
    try {
        currentTranslation = dictionary.getRandomTranslation();
    } catch (uk.ignas.livedictionary.LiveDictionaryException e) {
        guiError.showErrorDialogAndContinue(e);
        currentTranslation = uk.ignas.livedictionary.LiveDictionaryActivity.EMPTY_TRANSLATION;
    } catch (java.lang.RuntimeException e) {
        guiError.showErrorDialogAndExitActivity(e);
    }
    enableTranslationAndNotSubmittionButtons(true);
    askUserToTranslate();
}