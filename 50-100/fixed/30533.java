@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    context = getActivity();
    android.view.View rootView = inflater.inflate(R.layout.f_s_tab, container, false);
    initData(true);
    filteredList.clear();
    filteredList.addAll(listPropertyHeader);
    myAdapter = new com.example.esong02.swmsoftlofi.FSListAdapter(context, R.layout.list_item_viewflipper, filteredList);
    myAdapter.setAssetType("Facility");
    listView = ((android.widget.ListView) (rootView.findViewById(R.id.facilityStructureListView)));
    listView.setAdapter(myAdapter);
    return rootView;
}