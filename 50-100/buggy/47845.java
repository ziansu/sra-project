public void getPurchases() {
    try {
        android.os.Bundle purchaseItems = mService.getPurchases(3, getPackageName(), "inapp", null);
        int responseCode = purchaseItems.getInt("RESPONSE_CODE");
        if (responseCode == 0) {
            java.util.ArrayList<java.lang.String> items = purchaseItems.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            if (items.contains("com.aftersapp.noads")) {
                mSessionManager.setIsPurchased(AppConstants.ITEM_NOT_PURCHASED);
            }else {
                mSessionManager.setIsPurchased(AppConstants.ITEM_PURCHASED);
            }
        }
    } catch (android.os.RemoteException e) {
        e.printStackTrace();
    }
}