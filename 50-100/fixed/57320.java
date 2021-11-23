public void updateNamesList(java.lang.String[] names) {
    if (!(mNamesList.isEmpty())) {
        mNamesList.clear();
    }
    if (names != null) {
        for (java.lang.String s : names) {
            mNamesList.add(s);
        }
    }
    mAdapter.notifyDataSetChanged();
}