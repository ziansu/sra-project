public void ProductDetailsAddButtonOnClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent();
    android.widget.EditText Amount = ((android.widget.EditText) (this.findViewById(R.id.Amount_To_Add_Box)));
    java.lang.String query = Amount.getText().toString();
    intent.putExtra(this.getResources().getString(R.string.search_details_transaction_extras_key), this.transaction, query);
    this.finish();
}