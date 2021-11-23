@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    setListAdapter(new com.commonsware.calendarapp.MyCustomAdapter(getActivity(), events));
    getListView().setDivider(null);
}