public void resetPlayers(spil.Player... playerArray) {
    for (int i = 0, n = playerArray.length; i < n; i++) {
        desktop_resources.GUI.removeAllCars(playerArray[i].getName());
        placePlayer(playerArray[i], 12);
    }
}