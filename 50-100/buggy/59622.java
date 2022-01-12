public void applyForegroundColor(int color) {
    typing_fg = color;
    typingEffects.add(RichEditText.FOREGROUND);
    if ((getSelectionEnd()) <= (getText().length()))
        applyEffect(RichEditText.FOREGROUND, color);
    
    splitInactiveSpans(getText(), getSelectionStart(), getSelectionEnd(), 0);
    super.onSelectionChanged(getSelectionStart(), getSelectionEnd());
}