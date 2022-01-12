@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    gameData.setArmiesToPlace(((gameData.getArmiesToPlace()) + (calculateArmiesForStars(gameData.getUsers().get(0).getStars()))));
    gameData.getUsers().get(0).setStars(0);
    saveGameDataAndUpdateMap(gd);
    mCallback.broadcast(gameData.getByteArray());
}