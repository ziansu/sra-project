public static java.io.File getRootFolder() {
    final java.lang.String fileName = games.strategy.engine.framework.GameRunner2.getGameRunnerFileLocation("GameRunner2.class");
    final java.lang.String tripleaJarName = "triplea.jar!";
    if ((fileName.indexOf(tripleaJarName)) != (-1)) {
        return games.strategy.engine.framework.GameRunner2.getRootFolderRelativeToJar(fileName, tripleaJarName);
    }
    final java.lang.String tripleaJarNameWithEngineVersion = games.strategy.engine.framework.GameRunner2.getTripleaJarWithEngineVersionStringPath();
    if ((fileName.indexOf(tripleaJarNameWithEngineVersion)) != (-1)) {
        return games.strategy.engine.framework.GameRunner2.getRootFolderRelativeToJar(fileName, tripleaJarNameWithEngineVersion);
    }
    return games.strategy.engine.framework.GameRunner2.getRootRelativeToClassFile(fileName);
}