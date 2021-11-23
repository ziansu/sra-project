@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    tvCharacterCount.setText(((java.lang.String.valueOf(s.length())) + "/100"));
}