public void startLocalGame(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, group5.battleship.src.views.SetShipsActivity.class);
    intent.putExtra("NAME", playername.getText().toString());
    intent.putExtra("WIFI", false);
    startActivity(intent);
}