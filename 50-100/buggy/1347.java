protected void selectAllBarBtn() {
    if ((savedInstanceState) != null) {
        firstTimeLoading = savedInstanceState.getBoolean(rs.ftn.pma.tourismobile.fragments.FIRST_TIME_LOADING);
    }
    if (firstTimeLoading) {
        firstTimeLoading = false;
        return ;
    }
    java.util.List<java.lang.Integer> ids = new java.util.ArrayList<>();
    for (rs.ftn.pma.tourismobile.model.Tag tag : tagsAdapter.getItems()) {
        ids.add(tag.getId());
    }
    selectionPreference.selectedItemIDs().put(android.text.TextUtils.join(",", ids));
    tagsAdapter.notifyDataSetChanged();
}