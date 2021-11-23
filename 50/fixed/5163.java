private void editWord(android.app.Activity activity, lt.ru.lexio.db.Dictionary currentDictionary, java.lang.Long id) {
    lt.ru.lexio.db.Word word = wordDAO.read(id);
    saveWord(activity, currentDictionary, word);
}