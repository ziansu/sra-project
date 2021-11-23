@java.lang.Override
public void onBluetoothConnectionLost(@android.support.annotation.Nullable
android.bluetooth.BluetoothDevice device) {
    if (super.isGameActive()) {
        getGui().onOpponentDisconnected((device != null ? device.getName() : null));
    }else {
        game = null;
        getGui().onGameStopped();
    }
}