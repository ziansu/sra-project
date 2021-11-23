public static Scene parseScene(java.lang.String sceneName, Player player) throws java.io.IOException {
    java.lang.System.out.println(sceneName);
    java.io.File file = new java.io.File(SceneParser.class.getResource((("/Scenes/" + sceneName) + ".txt")).getPath());
    return SceneParser.parseScene(file, player);
}