@java.lang.Override
public void onUpdateSelection(int oldSelStart, int oldSelEnd, int newSelStart, int newSelEnd, int candidatesStart, int candidatesEnd) {
    super.onUpdateSelection(oldSelStart, oldSelEnd, newSelStart, newSelEnd, candidatesStart, candidatesEnd);
    java.lang.CharSequence text = getCurrentInputConnection().getExtractedText(new android.view.inputmethod.ExtractedTextRequest(), 0).text;
    candidateView.setSuggestion(getCurrentWord(text.toString(), newSelStart));
}