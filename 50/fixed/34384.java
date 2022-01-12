public void setPath(java.lang.String path) {
    sharedPrefEditor.putString("PATH", path);
    sharedPrefEditor.commit();
    listFragment.refresh();
}