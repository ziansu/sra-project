public void onAddNewAmountClick(android.view.View view) {
    amountAdded = true;
    if ((adapter) == null)
        adapter = new com.sarahehabm.carbcalculator.item.view.AddNewItemAmountsAdapter();
    
    adapter.addItem();
    validQuantities = adapter.isValidAmounts();
    supportInvalidateOptionsMenu();
    invalidateOptionsMenu();
}