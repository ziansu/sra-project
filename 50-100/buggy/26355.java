@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if (((s.length()) > 2) & (!(java.util.Arrays.asList(playerList).contains(s.toString())))) {
        oppo_text.setText(s.subSequence(0, 2));
        oppo_text.setSelection(chal_text.getText().length());
    }
    attemptDisplayMatch(spinner, chal_text, oppo_text);
}