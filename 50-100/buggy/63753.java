private void notSelected(android.view.View tab) {
    android.widget.TextView title = ((android.widget.TextView) (tab.findViewById(R.id.tab_title)));
    if (title != null) {
        title.setTypeface(tabTypeface, tabTypefaceStyle);
        android.support.v4.view.ViewCompat.setAlpha(title, tabTextAlpha);
    }
}