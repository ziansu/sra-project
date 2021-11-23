public void initScene(java.lang.String sceneName) {
    essentials.physicsStopped = true;
    sceneLoader = new com.uwsoft.editor.renderer.SceneLoader(essentials);
    sceneLoader.setResolution(com.uwsoft.editor.data.manager.DataManager.getInstance().resolutionManager.curResolution);
    currentSceneVo = sceneLoader.loadScene(sceneName, false);
    essentials.world = new com.badlogic.gdx.physics.box2d.World(new com.badlogic.gdx.math.Vector2(currentSceneVo.physicsPropertiesVO.gravityX, currentSceneVo.physicsPropertiesVO.gravityY), true);
    essentials.rayHandler.setWorld(essentials.world);
    rootSceneVO = new com.uwsoft.editor.renderer.data.CompositeItemVO(currentSceneVo.composite);
}