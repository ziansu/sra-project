@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, edu.augustana.csc490.mapgame.StreetMode_Multiplayer.class);
    intent.putExtra("actualPosition", actualPosition);
    if ((playerNum) == 0) {
        intent.putExtra("scorePlayer0", scorePlayer0);
    }else
        if ((playerNum) == 1) {
            intent.putExtra("scorePlayer1", scorePlayer1);
        }
    
    intent.putExtra("round", round);
    intent.putExtra("playerNum", playerNum);
    startActivity(intent);
}