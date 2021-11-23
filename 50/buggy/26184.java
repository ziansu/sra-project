@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    if ((mItemAdapter) != null) {
        outState.putString(com.muqdd.iuob2.features.schedule_builder.SectionsFilterActivity.SECTIONS_LIST, new com.google.gson.Gson().toJson(mItemAdapter.getAdapterItems(), com.muqdd.iuob2.features.schedule_builder.SectionsFilterActivity.SECTIONS_LIST_TYPE));
    }
    super.onSaveInstanceState(outState);
}