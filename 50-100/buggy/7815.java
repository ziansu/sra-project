public void prepareLevel(org.newdawn.slick.tiled.TiledMap currentMap, int spellingtonX, int spellingtonY) throws org.newdawn.slick.SlickException {
    activeProjectiles = new java.util.ArrayList<>();
    activeAnimations = new java.util.ArrayList<>();
    spellington.setAnimState(LivingEntity.AnimState.STANDING_R);
    spellington.setX(spellingtonX);
    spellington.setY(spellingtonY);
    spellington.setAnimState(LivingEntity.AnimState.STANDING_R);
    spellington.setSpeedVector(new ca.qc.bdeb.info204.spellington.calculations.Vector2D(0, 0));
    map = currentMap;
}