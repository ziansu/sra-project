public void onClick(android.view.View v) {
    playerStrawSelected = false;
    coinCycle = genRand(2);
    dialog.dismiss();
    spinCoin();
}