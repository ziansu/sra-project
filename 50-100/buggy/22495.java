@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.addtransaction);
    setToolbar(R.string.new_transaction);
    tvTransactionDate = ((android.widget.TextView) (findViewById(R.id.tvTransactionDate)));
    setDateTimeField();
    android.widget.Button btnTransactionAdd = ((android.widget.Button) (findViewById(R.id.btnTransactionAdd)));
    btnTransactionAdd.setOnClickListener(this);
    dataSource = new com.androidcollider.easyfin.database.DataSource(this);
    setSpinner();
}