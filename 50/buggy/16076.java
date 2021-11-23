@java.lang.Override
public void setOrientation(int orientation) {
    if ((android.widget.LinearLayout.HORIZONTAL) == orientation) {
        throw new java.lang.IllegalArgumentException("DragLinearLayout must be VERTICAL.");
    }
    super.setOrientation(orientation);
}