public void onTick(long millisUntilFinished) {
    java.lang.String timeStr = "";
    selectTiles();
    selectTiles();
    selectTiles();
    selectTiles();
    t.setText(timeStr.format("%d", (millisUntilFinished / 1000)));
}