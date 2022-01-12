@org.junit.Test
public void should_remove_target_word() {
    com.buzzit.buzzit.data.models.Word targetWord = new com.buzzit.buzzit.data.models.Word();
    targetWord.setId(1);
    targetWord.setTextEng("it's amazing");
    targetWord.setTextSpa("issa amassing");
    java.util.List<com.buzzit.buzzit.data.models.Word> words = new java.util.ArrayList<>();
    words.add(targetWord);
    org.mockito.Mockito.when(populateWordsStorageUseCase.populate()).thenReturn(rx.Observable.just(words));
    presenter.onCreate();
    org.mockito.Mockito.verify(removeWordUseCase).remove(targetWord);
}