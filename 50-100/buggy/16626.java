@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent;
    intent = new android.content.Intent(this, app.mapquest.com.mapquest.MapDisplay.class);
    java.lang.String finalSearchTerm = textView.getText().toString();
    java.lang.String gameID = app.mapquest.com.mapquest.api.Getting.getGameId(finalSearchTerm);
    if (gameID.equals("-1")) {
        android.widget.Toast.makeText(this, "Non existent game, we're very sorry.", Toast.LENGTH_LONG).show();
        return ;
    }
    intent.putExtra(MapDisplay.GAME_ARG, gameID);
    startActivity(intent);
}