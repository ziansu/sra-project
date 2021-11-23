private void notifyDataSetInvalidated() {
    android.support.v4.view.PagerAdapter adapter = mViewPager.getAdapter();
    final int count = adapter.getCount();
    for (int i = 0; i < count; i++) {
        android.widget.TextView tv = getTabView(i);
        java.lang.CharSequence title = adapter.getPageTitle(i);
        if (title == null)
            title = "NULL";
        
        tv.setText(title);
    }
    requestLayout();
}