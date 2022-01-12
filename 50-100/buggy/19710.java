@java.lang.Override
public android.view.View onCreateContentView(android.view.LayoutInflater inflater, android.os.Bundle savedInstanceState) {
    android.widget.LinearLayout view = ((android.widget.LinearLayout) (inflater.inflate(R.layout.fragment_contact, null)));
    mDataManager = com.android.smap.GatewayApp.getDependencyContainer().getDataManager();
    android.widget.ListView listView = ((android.widget.ListView) (view.findViewById(R.id.list_contacts)));
    listView.setOnItemClickListener(this);
    list = mDataManager.getContacts();
    mAdapter = new com.android.smap.adapters.ContactAdapter(getActivity(), R.layout.contact_allusers_rows, list);
    listView.setAdapter(mAdapter);
    return view;
}