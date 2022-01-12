@java.lang.Override
public void onClick(android.view.View v) {
    try {
        android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (context.getSystemService(android.content.Context.INPUT_METHOD_SERVICE)));
        imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);
    } catch (java.lang.Exception e) {
    }
    datePickerDialogForNomineeDob.show();
}