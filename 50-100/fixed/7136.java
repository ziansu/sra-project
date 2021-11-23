@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.widget.ListView myListView = ((android.widget.ListView) (getActivity().findViewById(R.id.equipmentList)));
    connectToJSON("?sort_by=it_no");
    int layoutID = R.layout.list_item;
    myAdapterInstance = new com.example.jim.myapplication.EquipmentAdapter(getActivity(), layoutID, equipmentList);
    myListView.setAdapter(myAdapterInstance);
}