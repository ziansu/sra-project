@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (hasFocus) {
        eventExec(nameEditText, nameClickList, "lastName");
    }else {
        nameEditText.setHint("");
    }
}