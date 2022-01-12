private void publishNextTranslation() {
    try {
        currentTranslation = dictionary.getRandomTranslation();
    } catch (uk.ignas.livedictionary.LiveDictionaryException e) {
        guiError.showErrorDialogAndContinue(e.getMessage());
        currentTranslation = uk.ignas.livedictionary.LiveDictionaryActivity.EMPTY_TRANSLATION;
    } catch (java.lang.RuntimeException e) {
        guiError.showErrorDialogAndExitActivity(e.getMessage());
    }
    enableTranslationAndNotSubmittionButtons(true);
    askUserToTranslate();
}