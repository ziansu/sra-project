private void refreshBalancesForAllLinkedBrokers() {
    java.util.List<it.trade.android.sdk.model.TradeItLinkedBrokerParcelable> linkedBrokers = linkedBrokerManager.getLinkedBrokers();
    if (linkedBrokers.isEmpty()) {
        showAlert("refreshAllBalancesFirstLinkedBroker", "No linked broker!");
    }else
        if (linkedBrokers.get(0).getAccounts().isEmpty()) {
            showAlert("refreshAllBalancesFirstLinkedBroker", "No linked broker accounts detected for first linked broker! Try authenticating.");
        }else {
            final it.trade.android.sdk.model.TradeItLinkedBrokerParcelable linkedBroker = linkedBrokers.get(0);
            linkedBrokerManager.refreshAccountBalances(new it.trade.android.sdk.model.TradeItCallBackCompletion() {
                @java.lang.Override
                public void onFinished() {
                    goToLinkedBrokersActivity();
                }
            });
        }
    
}