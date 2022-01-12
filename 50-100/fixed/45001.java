@java.lang.Override
protected void onResume() {
    super.onResume();
    android.content.Intent intent = new android.content.Intent(this, com.volgoak.pokertournament.BlindsService.class);
    boolean binded = bindService(intent, this, 0);
    mReceiver = new com.volgoak.pokertournament.TournamentActivity.MyTimeReceiver();
    mIntentFilter = new android.content.IntentFilter(com.volgoak.pokertournament.TournamentActivity.RECEIVER_CODE);
    registerReceiver(mReceiver, mIntentFilter);
}