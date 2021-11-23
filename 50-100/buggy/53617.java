@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    android.view.View karbo = findViewById(R.id.karbo);
    karbo.setNextFocusDownId(R.id.blodsugar);
    android.view.View bs = findViewById(R.id.blodsugar);
    bs.setNextFocusDownId(R.id.calcButton);
    karbo.requestFocus();
    android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
}