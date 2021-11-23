private static void sendResultWithDns(int result_code, java.lang.String dns1, java.lang.String dns2) {
    android.content.Intent result_intent = new android.content.Intent(ValueConstants.ACTION_SET_DNS);
    result_intent.putExtra("result_code", result_code);
    result_intent.putExtra("dns1", dns1);
    result_intent.putExtra("dns2", dns2);
}