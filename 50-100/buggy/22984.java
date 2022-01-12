@java.lang.Override
protected void onTextChanged(java.lang.CharSequence text, int start, int lengthBefore, int lengthAfter) {
    super.onTextChanged(text, start, lengthBefore, lengthAfter);
    if ((handler) == null) {
        handler = new android.os.Handler();
    }
    handler.removeCallbacks(textChangeRunnable);
    handler.postDelayed(textChangeRunnable, onTextChangeDelayMs);
    com.github.kubatatami.richedittext.other.SpanUtil.removeSuggestionUnderlineSpans(((android.text.Spannable) (text)));
}