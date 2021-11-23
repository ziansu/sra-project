private void refreshHeadings() {
    java.lang.String[] headings = eddiecurtis.github.com.kosmicare.FileManager.instance().getVisitorHeadings();
    if ((fileCount) < (headings.length)) {
        fileCount = headings.length;
        mDrawerListView.setAdapter(new android.widget.ArrayAdapter<java.lang.String>(getActionBar().getThemedContext(), android.R.layout.simple_list_item_activated_1, android.R.id.text1, headings));
    }
}