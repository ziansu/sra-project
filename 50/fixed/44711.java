@java.lang.Override
protected void onStart() {
    super.onStart();
    com.example.jack.thousandorigamicranes.NoteList.updateAdapter();
    mListView.setAdapter(com.example.jack.thousandorigamicranes.NoteList.mAdapter);
    mListView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
}