@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((adapter) != null) {
        adapter.filter(s.toString());
        addFooterHandler(s.toString());
    }
}