@java.lang.Override
public void onClick(android.view.View view) {
    if (game.getTypeOfGame().equals("1 VS 1")) {
        android.util.Log.w("device name", device.getName());
        edu.utep.cs.cs4330.battleship.ProgressDialog.show(this, "Loading", "Wait for other player to place boats...");
        android.util.Log.w("Get name", mBluetoothAdapter.getName());
    }else {
        playGameView(game.getHumanPlayer().boardView);
    }
}