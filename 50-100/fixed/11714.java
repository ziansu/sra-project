public void initScene(final int scale, final com.jme3.math.Vector3f translation) {
    java.lang.System.out.println("SCENE_PATH file found!");
    java.lang.System.out.println((("=> loading " + (com.funkydonkies.gamestates.SceneState.SCENE_PATH.toString())) + " Spatial ..."));
    loadScene(scale, translation);
    java.lang.System.out.println("... DONE loading .scene Spatial <=");
}