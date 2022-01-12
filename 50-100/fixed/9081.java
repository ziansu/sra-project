@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.jaitlapps.bestadvice.domain.list.ListRecordGroup listRecordGroup = com.jaitlapps.bestadvice.database.FavoriteManager.getInstance(getActivity()).getList();
    com.jaitlapps.bestadvice.adapter.ListAdapter adapter = new com.jaitlapps.bestadvice.adapter.ListAdapter(getActivity(), listRecordGroup);
    setListAdapter(adapter);
}