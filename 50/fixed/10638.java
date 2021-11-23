public void InitBill() {
    conn.Open();
    conn.Close();
    adapterBill = new com.example.huynhthanhnha.myapplication.fragments.BillFragment.BillAdapter(getActivity(), listBill);
    listView.setAdapter(adapterBill);
}