private void endGameAsGuest() {
    mGuestPlayer.leaveGame();
    mGuestFirstConnectted = false;
    unregisterReceiver(mNetworkConnectChangedReceiver);
}