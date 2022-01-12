public void startWifiGame(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, group5.battleship.src.views.WifiManagerActivity.class);
    intent.putExtra("NAME", playername.getText().toString());
    intent.putExtra("WIFI", true);
    startActivity(intent);
}