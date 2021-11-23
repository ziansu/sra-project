public void replaceSelectedText(java.lang.CharSequence s, boolean reselect) {
    final int st = getSelectionStart();
    final int en = getSelectionEnd();
    android.text.Editable e = getText();
    e.replace(st, en, s);
    final int nen = st + (s.length());
    final int nst = (reselect) ? st : nen;
    setSelection(nst, nen);
}