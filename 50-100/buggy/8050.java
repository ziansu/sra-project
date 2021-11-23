private void init() {
    for (int i = 1; i <= (levelCount); i++) {
        levels.add(new world.Level(i));
    }
    backgroundX = java.lang.Integer.parseInt(currentLevel.getWallData(0));
    backgroundY = java.lang.Integer.parseInt(currentLevel.getWallData(1));
    background = new renderer.Background(0, 0, this, world.Level.getImageData(0));
    inventory = new renderer.Texture("Assets/Pictures/Textures/Inventory_l1.png");
    c = new vault1.CharacterFolder.Controller(this);
}