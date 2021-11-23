private void onEmojiconsPressed() {
    if ((emojiconsViewGroup.getVisibility()) == (android.view.View.VISIBLE)) {
        emojiconsViewGroup.setVisibility(View.GONE);
    }else {
        android.view.View view = this.getCurrentFocus();
        if (view != null) {
            android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        emojiconsViewGroup.setVisibility(View.VISIBLE);
    }
}