public void setAccountHistory(java.util.ArrayList<java.lang.String> AccountHistoryList) {
    while (((AccountHistory) == null) && ((AccountHistoryAdapter) == null));
    AccountHistoryAdapter = new android.widget.ArrayAdapter(this, android.R.layout.simple_spinner_item, AccountHistoryList);
    AccountHistoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    AccountHistory.setAdapter(AccountHistoryAdapter);
    AccountHistory.setPrompt("AccountHistory");
    if ((AccountHistoryList != null) && ((AccountHistoryList.size()) != 0))
        AccountHistory.setVisibility(View.VISIBLE);
    
}