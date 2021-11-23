@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if (!(currentQuery.equalsIgnoreCase(s.toString()))) {
        notifySearchQueryChanged(s.toString());
    }
}