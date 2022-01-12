private void startActivity(java.lang.String amount, java.lang.String currency, java.lang.String type, java.lang.String env) {
    android.content.Intent intent = new android.content.Intent(activity, devsupport.ai.peachpay.PeachPay.class);
    intent.putExtra("amount", amount);
    intent.putExtra("currency", currency);
    intent.putExtra("type", true);
    intent.putExtra("env", env);
    activity.startActivity(intent);
}