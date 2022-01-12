protected void delete(android.widget.EditText edit) {
    int st = edit.getSelectionStart();
    int ed = edit.getSelectionEnd();
    if (st == ed) {
        return ;
    }else
        if (st > ed) {
            int tmp = st;
            st = ed;
            ed = tmp;
        }
    
    android.text.Editable editable = edit.getEditableText();
    editable.delete(st, ed);
}