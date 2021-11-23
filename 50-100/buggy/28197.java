@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    SetAllFlagsTo(false);
    if ((s.length()) == 10) {
        entered_data = true;
        search_text = true;
        btnSearch.setEnabled(true);
    }else {
        btnSearch.setEnabled(false);
        entered_data = false;
        search_text = false;
    }
}