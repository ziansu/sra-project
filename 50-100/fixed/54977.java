@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.cancel();
    for (int i = 0; i < (playerFromDb.size()); i++) {
        dialog.cancel();
        matchmaking.com.whoplay.DataManager.getInstance().playerDataInDb.remove(matchmaking.com.whoplay.DataManager.getInstance().playerDataInDb.indexOf(playerFromDb.get(i)));
        updateUI();
    }
    playerFromDb.clear();
}