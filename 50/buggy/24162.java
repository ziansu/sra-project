public void setupQuick() {
    characterList.add(tankRevolution.model.CharacterFactory.newPlayer(Id.PLAYER1));
    characterList.add(tankRevolution.model.CharacterFactory.newNPC(Id.PLAYER2, NPCDifficulty.SUPERHARD));
    tankRevolution.utils.AssetsManager.getInstance().loadNewGameAssets(2, "Burning Desert Wolf");
}