public boolean isEmpty() {
    int n = getChildCount();
    if (n == 0)
        return true;
    
    android.view.View child = getChildAt(1);
    if (child instanceof android.widget.LinearLayout) {
        return (((android.widget.LinearLayout) (child)).getChildCount()) > 0;
    }
    return false;
}