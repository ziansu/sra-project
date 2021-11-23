@java.lang.Override
public void onStart() {
    super.onStart();
    if (!(btAdapter.isEnabled())) {
        android.content.Intent enableIntent = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivityForResult(enableIntent, johmphot.card.bluetooth.MultiplayerGameActivity.REQUEST_ENABLE_BT);
    }else
        if ((btGameService) == null) {
            try {
                setupGame();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    
}