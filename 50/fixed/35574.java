@java.lang.Override
protected com.jecelyin.editor.v2.core.text.SpannableStringBuilder doInBackground(java.io.File... params) {
    try {
        fileReader.read();
    } catch (java.lang.Throwable t) {
        error = t;
    }
    return listener.onAsyncReaded(fileReader);
}