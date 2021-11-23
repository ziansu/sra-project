void save(android.content.Context context) {
    ca.rmen.android.poetassistant.main.reader.PoemFile savedPoem = mPoemPrefs.getSavedPoem();
    ca.rmen.android.poetassistant.main.reader.PoemFile.save(context, savedPoem.uri, poem.get(), mPoemFileCallback);
}