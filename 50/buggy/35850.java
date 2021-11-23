@java.lang.Override
public void onStart() {
    super.onStart();
    setListAdapter(mListAdapter);
    getListView().setOnItemClickListener(this);
}