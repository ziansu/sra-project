@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.d(com.volgoak.pokertournament.TournamentActivity.TAG, "onResume: ");
    android.content.Intent intent = new android.content.Intent(this, com.volgoak.pokertournament.BlindsService.class);
    boolean binded = bindService(intent, this, 0);
    android.util.Log.d(com.volgoak.pokertournament.TournamentActivity.TAG, ("onResume: binded is " + binded));
    mReceiver = new com.volgoak.pokertournament.TournamentActivity.MyTimeReceiver();
    mIntentFilter = new android.content.IntentFilter(com.volgoak.pokertournament.TournamentActivity.RECEIVER_CODE);
    registerReceiver(mReceiver, mIntentFilter);
}