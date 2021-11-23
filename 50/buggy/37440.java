@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    _adapter = new com.axelby.podax.ui.ITunesToplistFragment.ITunesToplistAdapter(getActivity());
    _listView.setAdapter(_adapter);
}