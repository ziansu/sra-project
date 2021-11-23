@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... aVoid) {
    com.ringsterz.androidtextreader.BibleManager bibleManager = com.ringsterz.androidtextreader.BibleManager.getInstance(context);
    bibleManager.insertBook();
    bibleManager.insertPhrase();
    return null;
}