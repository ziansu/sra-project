@java.lang.Override
public void scrollVerticallyTo(int y) {
    android.view.View firstVisibleChild = getChildAt(0);
    if (firstVisibleChild != null) {
        int baseHeight = firstVisibleChild.getHeight();
        int position = (baseHeight == 0) ? 0 : y / baseHeight;
        setSelection(position);
    }
}