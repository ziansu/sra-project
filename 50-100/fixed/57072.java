public void onUnlockButtonClick(android.view.View v) {
    android.widget.LinearLayout pnDefault = ((android.widget.LinearLayout) (findViewById(R.id.pnDefault)));
    pnDefault.setVisibility(View.GONE);
    android.widget.LinearLayout pnDone = ((android.widget.LinearLayout) (findViewById(R.id.pnClicked)));
    pnDone.setVisibility(View.VISIBLE);
}