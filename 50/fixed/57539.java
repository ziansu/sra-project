@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pay);
    event = getIntent().getParcelableExtra(com.niupiao.niupiao.activities.PayActivity.INTENT_KEY_FOR_EVENT);
    paymentManager = new com.niupiao.niupiao.managers.PaymentManager(event, this);
    show(com.niupiao.niupiao.activities.PayActivity.PaymentPhase.PURCHASE_TICKETS);
}