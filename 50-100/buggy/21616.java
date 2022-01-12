@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bank);
    setSupportActionBar(toolbar);
    butterknife.ButterKnife.bind(this);
    mBankId = getIntent().getIntExtra(androks.rate.Activities.BankActivity.BANK_ID, 0);
    toolbar.setTitle(androks.rate.api.Utils.getFriendlyBankTitle(getApplicationContext(), mBankId));
    showProgress();
    updateData();
}