public void onClick(android.view.View v) {
    fold();
    popupWindow.dismiss();
    hideUserOptions();
    showPlayerAction(0, "Fold");
    thread.postDelayed(new java.lang.Runnable() {
        public void run() {
            simulateTurns();
        }
    }, 5000);
}