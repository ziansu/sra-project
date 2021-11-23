private void Cart() {
    android.widget.ListView lvBill = ((android.widget.ListView) (findViewById(R.id.lvBill)));
    if ((lvBill != null) && ((arrayItemCart) != null)) {
        basic.zhenyuan0502.nguyenlt.armstore.adapter.CartAdapter cartAdapter = new basic.zhenyuan0502.nguyenlt.armstore.adapter.CartAdapter(getApplicationContext(), arrayItemCart);
        cartAdapter.notifyDataSetChanged();
        lvBill.setAdapter(cartAdapter);
    }
}