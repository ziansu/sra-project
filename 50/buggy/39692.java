public void updateList(java.lang.String searchString) {
    this.searchString = searchString;
    if ((getActivity()) != null) {
        sectionedListAdapter.changeList(createList(searchString));
    }
}