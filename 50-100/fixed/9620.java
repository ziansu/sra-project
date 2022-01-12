private void processTransactionDetails(com.example.danie.schoolcashless.Transaction transaction, org.json.JSONObject json) throws org.json.JSONException {
    java.lang.Number completed = ((java.lang.Number) (json.get("completed")));
    transaction.setUnixTime(completed.intValue());
    org.json.JSONObject with = ((org.json.JSONObject) (json.get("with")));
    java.lang.String name = with.getString("name");
    transaction.setWith(name);
}