@java.lang.Override
public void onDisconnect() {
    super.onDisconnect();
    disconnect((!(useClientMode)));
}