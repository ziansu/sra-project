@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    if (hasFocus && ((cursorView) != null)) {
        int cursorWidth = cursorView.getWidth();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenWidth = displayMetrics.widthPixels;
        int cursorOffset = ((screenWidth / 4) - cursorWidth) / 2;
        pageWidth = (cursorOffset * 2) + cursorWidth;
        com.gzfgeh.tools.SetViewMargin.SetViewMarginLeft(cursorView, cursorOffset);
    }
}