private void addButton(android.widget.Button btn) {
    if ((btn.getId()) == (R.id.btnAdd)) {
        num1 = getDisplay().getText().toString();
        java.lang.System.out.println(("NUM1: " + (num1)));
        getDisplay().getText().clear();
        addFunctionActive = true;
    }
}