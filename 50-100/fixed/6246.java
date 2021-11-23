private void addButton(android.widget.Button btn) {
    if ((btn.getId()) == (R.id.btnAdd)) {
        num1 = getDisplay().getText().toString();
        getDisplay().getText().clear();
        addFunctionActive = true;
    }
}