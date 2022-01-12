@java.lang.Override
public void receiveInfo(com.example.administrator.scrabble.game.infoMsg.GameInfo info) {
    if (info instanceof com.example.administrator.scrabble.Scrabble.ScrabbleState) {
        this.gameState = ((com.example.administrator.scrabble.Scrabble.ScrabbleState) (info));
    }
    if (info instanceof com.example.administrator.scrabble.game.infoMsg.IllegalMoveInfo) {
        if ((getTilesToPlace().size()) == 0) {
        }else {
            android.widget.Toast.makeText(currentActivity.getApplicationContext(), "Sorry, that word is not a valid word.", Toast.LENGTH_SHORT).show();
        }
    }
}