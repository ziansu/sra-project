private boolean sendEmptyAnswer() {
    if ((uiSubscriber) != null) {
        uiSubscriber.onTranslateResponse(new yandex.muratov.translator.network.data.TranslateAnswer().setCode(DataCodes.VALID_ANSWER_CODE));
        uiSubscriber.onDictionaryResponse(new yandex.muratov.translator.network.data.DictionaryAnswer().setCode(DataCodes.VALID_ANSWER_CODE));
        return true;
    }
    return false;
}