@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    imm.hideSoftInputFromWindow(input.getWindowToken(), 0);
    dialog.dismiss();
    returnToTitleScreen();
}