@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    client = com.reimaginebanking.api.nessieandroidsdk.requestclients.NessieClient.getInstance("d9d2932feb9206207df39b565750ceb4");
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home_page);
    categoryButton = ((android.widget.Button) (findViewById(R.id.category_button)));
    categoryButton.setOnClickListener(this);
    historyButton = ((android.widget.Button) (findViewById(R.id.history_button)));
    historyButton.setOnClickListener(this);
    getAccounts(LoginActivity.currentCustomer);
    getPurchasesFromAccounts(customerAccounts);
}