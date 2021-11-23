@java.lang.Override
public void finish() {
    user.setInventory(inventory);
    saveUser();
    updateOnline();
    setResult(cmput301exchange.exchange.Activities.RESULT_OK, new android.content.Intent());
    super.finish();
}