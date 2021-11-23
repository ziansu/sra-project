public void InitBill() {
    conn.Open();
    priceTotal = conn.getPriceAllBill();
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.set(2015, 9, 24);
    conn.getPriceProductInCurrentBill(1, cal);
    conn.Close();
    tvTotal.setText(((java.lang.String.valueOf(priceTotal)) + " VNĐ"));
    adapterBill = new com.example.huynhthanhnha.myapplication.activity.BillActivity.BillAdapter(this, listBill);
    listView.setAdapter(adapterBill);
}