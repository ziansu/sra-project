@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((s.length()) > (len)) {
        setSelection(len);
    }else {
        setSelection(s.length());
    }
}