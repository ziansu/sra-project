@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (hasFocus) {
        showDialog(com.flipkart.todo.AddFragment.DATE_DIALOG_ID).show();
    }
}