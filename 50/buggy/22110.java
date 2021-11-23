public void addSection(java.lang.String name, int iconId, java.util.List<java.lang.String> children) {
    mSections.add(new com.google.android.sambadocumentsprovider.browsing.BrowsingAdapter.Section(name, iconId, children));
    notifyDataSetChanged();
}