@java.lang.Override
public void dispatchCompletionEvent() {
    java.util.List<com.matteoveroni.wordsremember.dictionary.pojos.Word> foundTranslations = com.matteoveroni.wordsremember.dictionary.model.DictionaryDAO.cursorToListOfTranslations(queryCompleteCursor);
    com.matteoveroni.wordsremember.dictionary.events.translation.EventAsyncSearchVocableTranslationsCompleted event = new com.matteoveroni.wordsremember.dictionary.events.translation.EventAsyncSearchVocableTranslationsCompleted(vocable, foundTranslations);
    queryCompleteCursor.close();
    org.greenrobot.eventbus.EventBus.getDefault().postSticky(event);
}