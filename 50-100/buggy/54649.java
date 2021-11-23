@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        com.example.fanchaozhou.project1.MainFragment.dataListAdaptor = new android.widget.ArrayAdapter<java.lang.String>(getActivity(), R.layout.single_record, R.id.list_item_record, com.example.fanchaozhou.project1.MainFragment.dataList);
    }
    com.example.fanchaozhou.project1.MainFragment.dbHandle = new com.example.fanchaozhou.project1.DBAccess(this.getActivity());
}