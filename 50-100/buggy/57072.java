public void onUnlockButtonClick(android.view.View v) {
    android.content.Intent toggleAlarmOperation = new android.content.Intent(this, com.orangutandevelopment.wearablechess.UpgradeNowServiceWear.class);
    toggleAlarmOperation.setAction(UpgradeNowServiceWear.ACTION_TOGGLE_ALARM);
    this.startService(toggleAlarmOperation);
    android.widget.LinearLayout pnDefault = ((android.widget.LinearLayout) (findViewById(R.id.pnDefault)));
    pnDefault.setVisibility(View.GONE);
    android.widget.LinearLayout pnDone = ((android.widget.LinearLayout) (findViewById(R.id.pnClicked)));
    pnDone.setVisibility(View.VISIBLE);
}