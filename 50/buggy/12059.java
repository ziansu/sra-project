@java.lang.Override
public void onSceneGraphChanged(com.mbrlabs.mundus.events.SceneGraphChangedEvent sceneGraphChangedEvent) {
    buildTree(projectManager.current().currScene.sceneGraph);
}