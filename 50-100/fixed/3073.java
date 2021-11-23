private void replaceInScene(java.util.ArrayList<java.lang.String> items) {
    java.lang.System.out.println("Replacing...");
    java.lang.System.out.println((" with " + (findGameObject(allGameObjects, items.get(1)).getName())));
    java.lang.System.out.println(("Replacing: " + (findSceneObject(activeScene, items.get(0)).getName())));
    activeScene.replaceObject(findSceneObject(activeScene, items.get(0)), findGameObject(allGameObjects, items.get(1)));
}