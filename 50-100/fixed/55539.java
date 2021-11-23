@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    if (!hasFocus)
        if (((imm) != null) && ((titleEdit) != null))
            imm.hideSoftInputFromWindow(titleEdit.getWindowToken(), 0);
        
    
}