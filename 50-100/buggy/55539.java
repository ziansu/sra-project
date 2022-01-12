@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    if (((!hasFocus) && (!(titleEdit.isFocused()))) && (!(bodyEdit.isFocused())))
        imm.hideSoftInputFromWindow(titleEdit.getWindowToken(), 0);
    
}