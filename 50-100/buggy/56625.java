public void initPlayer() {
    java.lang.Character playerCharacter = new java.lang.Character(this, "Gandalf", 9, 13);
    deadlybanquet.model.World.playerBrain = new deadlybanquet.ai.PlayerBrain();
    player = new deadlybanquet.model.Player(playerCharacter, deadlybanquet.model.World.playerBrain);
    roomMap[2][2].addCharacter(playerCharacter);
}