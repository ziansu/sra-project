@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((remDP) != null) {
        remDateTxt.setText(s.toString());
    }
}