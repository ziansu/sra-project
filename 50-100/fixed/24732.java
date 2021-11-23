protected android.view.View getViewForInfo(com.android.launcher3.ShortcutInfo item) {
    for (int j = 0; j < (mContent.getCountY()); j++) {
        for (int i = 0; i < (mContent.getCountX()); i++) {
            android.view.View v = mContent.getChildAt(i, j);
            if ((v.getTag()) == item) {
                return v;
            }
        }
    }
    return null;
}