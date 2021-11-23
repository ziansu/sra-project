private void hideKeyboard(android.content.Context c, android.view.View v) {
    android.util.Log.d(org.eyeseetea.malariacare.layout.adapters.survey.DynamicTabAdapter.TAG, "KEYBOARD HIDE ");
    android.view.inputmethod.InputMethodManager keyboard = ((android.view.inputmethod.InputMethodManager) (c.getSystemService(Context.INPUT_METHOD_SERVICE)));
    if (v != null)
        keyboard.hideSoftInputFromWindow(keyboardView.getWindowToken(), 0);
    
}