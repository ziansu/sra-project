@java.lang.Override
protected void onPostExecute(com.jecelyin.editor.v2.core.text.SpannableStringBuilder spannableStringBuilder) {
    listener.onDone(spannableStringBuilder, error);
}