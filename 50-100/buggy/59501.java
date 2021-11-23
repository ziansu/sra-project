protected void delete(android.widget.EditText edit) {
    int st = edit.getSelectionStart();
    int ed = edit.getSelectionEnd();
    if (st == ed) {
        return ;
    }
    android.text.Editable editable = edit.getEditableText();
    editable.delete(st, ed);
}