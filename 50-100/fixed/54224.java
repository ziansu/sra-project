public com.jme3.scene.Geometry makeFloor(com.jme3.asset.AssetManager assetManager) {
    com.jme3.scene.shape.Box box = new com.jme3.scene.shape.Box(1500, 0.02F, 1500);
    floor = new com.jme3.scene.Geometry("Floor", box);
    floor.setLocalTranslation(0, (-5), 0);
    com.jme3.material.Material mat1 = new com.jme3.material.Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
    mat1.setColor("Color", ColorRGBA.Gray);
    mat1.setTransparent(true);
    mat1.setTexture("ColorMap", assetManager.loadTexture("Textures/transparent.png"));
    floor.setMaterial(mat1);
    return floor;
}