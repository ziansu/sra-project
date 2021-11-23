public java.util.List<java.lang.Character> setupQuick() {
    java.util.List<java.lang.Character> characters = new java.util.ArrayList<java.lang.Character>();
    characters.add(tank_revolution.model.CharacterFactory.newPlayer(Id.PLAYER1));
    characters.add(tank_revolution.model.CharacterFactory.newNPC(Id.PLAYER2, 2));
    tank_revolution.Utils.AssetsManager.getInstance().loadStartingAssets(2);
    return characters;
}