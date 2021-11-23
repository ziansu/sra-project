@java.lang.Override
protected void onPostExecute(java.util.List<lt.ru.lexio.db.Word> words) {
    if (succ)
        wordDAO.update(words);
    
}