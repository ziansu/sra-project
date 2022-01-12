@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String key = s.toString();
    mSerachKey = key;
    initData();
}