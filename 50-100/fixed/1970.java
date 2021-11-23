private static void createLevel() {
    com.game.obj.Blackhole.setBx(com.game.GameSettings.LevelLoader.Blackhole_posX);
    com.game.obj.Blackhole.setBy(com.game.GameSettings.LevelLoader.Blackhole_posY);
    com.game.obj.Blackhole.setAttraction(com.game.GameSettings.LevelLoader.Blackhole_Attraction);
    com.game.obj.Gegner.setGy(com.game.GameSettings.LevelLoader.Gegner_posY);
    com.game.obj.Gegner.setMaxEnergy(com.game.GameSettings.LevelLoader.Gegner_energy);
    com.game.obj.Gegner.setSchaden(com.game.GameSettings.LevelLoader.Gegner_schaden);
    com.game.obj.Player.setPy(com.game.GameSettings.LevelLoader.Gegner_posY);
    com.game.obj.Player.setMaxEnergy(com.game.GameSettings.LevelLoader.Player_energy);
    com.game.obj.Player.setSchaden(com.game.GameSettings.LevelLoader.Player_schaden);
}