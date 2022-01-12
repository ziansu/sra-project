public void onFocusChange(android.view.View v, boolean hasFocus) {
    if ((!hasFocus) && (v instanceof android.widget.TextView)) {
        java.lang.String str = java.lang.String.valueOf(((android.widget.TextView) (v)).getText());
        if ("".equals(str)) {
            updateView();
        }else {
            validateCurrentView(str);
        }
    }
}