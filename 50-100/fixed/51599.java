@java.lang.Override
public void onEvent(java.lang.Object event) {
    try {
        java.lang.String cardAddress = com.blochstech.bitcoincardterminal.Model.Model.Instance().getCardAddress();
        if ((cardAddress != null) && ((cardAddress.length()) > 0)) {
            if (useNfc) {
                useNfc = false;
                Address(cardAddress);
                UpdateEvent.fire(fireKey, null);
            }
        }
    } catch (java.lang.Exception ex) {
        com.blochstech.bitcoincardterminal.ViewModel.ViewStateManagers.MessageManager.Instance().AddMessage(ex.toString(), true);
    }
}