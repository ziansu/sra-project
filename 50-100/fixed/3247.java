@java.lang.Override
public com.helpme.app.utils.tuple.Tuple3<com.helpme.app.world.level.ILevel, com.helpme.app.world.body.IBody, com.helpme.app.world.consciousness.IConsciousness[]> loadGame(java.lang.String filePath) {
    try {
        com.helpme.app.saveload.SaveRoot saveRoot = unmarshall(filePath);
        return new com.helpme.app.utils.tuple.Tuple3(saveRoot.loadLevel(), saveRoot.loadPlayer(), saveRoot.loadEnemies());
    } catch (javax.xml.bind.JAXBException e) {
        java.lang.System.out.println("Could not load game from that path");
        java.lang.System.out.println(e);
        return null;
    }
}