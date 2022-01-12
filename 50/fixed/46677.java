void updatePoemText() {
    android.util.Log.d(ca.rmen.android.poetassistant.main.reader.ReaderViewModel.TAG, "Update poem text");
    mPoemPrefs.updatePoemText(poem.get());
}