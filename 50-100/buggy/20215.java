public void startPaymentActivity(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.worldtreeinc.leaves.activity.PaymentOptionActivity.class);
    com.worldtreeinc.leaves.utility.ParseProxyObject proxyObject = new com.worldtreeinc.leaves.utility.ParseProxyObject(event);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putSerializable("event", proxyObject);
    intent.putExtras(bundle);
    intent.putExtra("entry_fee", event.getEntryFee());
    intent.putExtra("payment_type", "TYPE GOES HERE");
    startActivity(intent);
}