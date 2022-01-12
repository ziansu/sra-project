public void spawn(com.totemdefender.TotemDefender game) {
    weaponSprite = "cannon.png";
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