@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    android.widget.Toast.makeText(getApplicationContext(), "Play Deleted", Toast.LENGTH_SHORT).show();
    undoStats();
    if ((playCounter) > 1) {
        revertToLastPlay(gamePlays.get(((playCounter) - 1)));
    }else {
        completeReset();
        resetValues();
    }
    updateScore();
    removeButton(playCounter);
    gamePlays.remove((--(playCounter)));
}