public static Scene parseScene(java.lang.String sceneName, Player player) throws java.io.IOException {
    java.io.File file = new java.io.File(SceneParser.class.getResource((("/Scenes/" + sceneName) + ".txt")).getPath());
    return SceneParser.parseScene(file, player);
}