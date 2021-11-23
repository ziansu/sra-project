@java.lang.Override
public void setAdapter(android.widget.Adapter adapter) {
    mAdapter = adapter;
    mCurrent = 0;
    requestLayout();
}