public void spawn(com.totemdefender.TotemDefender game) {
    com.totemdefender.entities.Texture weaponTexture = game.getAssetManager().get("cannon.png", com.totemdefender.entities.Texture.class);
    setSprite(new com.totemdefender.entities.Sprite(weaponTexture));
    com.totemdefender.entities.cbaacd3d378b81e25a32d83f98c06a0f6578 weaponSprite = "cannon.png";
    origin.y = 14;
    if ((owner.getID()) == 1) {
        origin.x = 98;
    }else
        origin.x = 30;
    
    barrelPosX = 95;
    barrelPosY = 20;
    super.spawn(game);
    java.lang.System.out.println("Cannon Weapon was Spawned");
}