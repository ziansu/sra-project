@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_bill, container, false);
    listView = ((android.widget.ListView) (view.findViewById(R.id.listBill)));
    conn.Open();
    conn.Close();
    adapterBill = new com.example.huynhthanhnha.myapplication.fragments.BillFragment.BillAdapter(getActivity(), listBill);
    listView.setAdapter(adapterBill);
    return view;
}