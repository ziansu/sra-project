private void populateCOList() {
    android.os.Bundle extras = getIntent().getExtras();
    java.util.ArrayList<teammemes.tritonbudget.db.TranHistory> trans = ((java.util.ArrayList) (extras.getSerializable("Transactions")));
    teammemes.tritonbudget.Checkout_Adapter co_adapter = new teammemes.tritonbudget.Checkout_Adapter(this, trans);
    android.widget.ListView CO_View = ((android.widget.ListView) (findViewById(R.id.ItemsContainer)));
    CO_View.setAdapter(co_adapter);
}