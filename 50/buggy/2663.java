@java.lang.Override
public void updateGSheetsResult(java.util.List<com.github.pl4gue.data.entity.HomeWorkEntry> homeWorkEntryList) {
    mHomeworkList = homeWorkEntryList;
    mAdapter = new com.github.pl4gue.adapters.GSheetsAdapter(mHomeworkList, this);
    mHomeworkListRecyclerView.setAdapter(mAdapter);
    mAdapter.notifyDataSetChanged();
}