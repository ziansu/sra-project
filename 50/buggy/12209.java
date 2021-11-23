public void onQueryInventoryFinished(es.claucookie.recarga.iabutil.IabResult result, es.claucookie.recarga.iabutil.Inventory inventory) {
    es.claucookie.recarga.logic.InAppBillingLogic.getInstance().setInventory(inventory);
    checkInappStatusAndShowInfo();
}