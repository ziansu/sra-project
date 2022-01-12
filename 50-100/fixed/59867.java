@java.lang.Override
protected java.lang.Object doInBackground(java.lang.Object... arg0) {
    int wordBookId = ((int) (arg0[0]));
    java.util.List<edu.iedu.flashcard.dao.domain.Word> test = edu.iedu.flashcard.service.WordService.getWordList(wordBookId);
    wordList.addAll(test);
    adapter.notifyDataSetChanged();
    return null;
}