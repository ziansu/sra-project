@java.lang.Override
public void draw(level.maps.Level level, int tileX, int tileY, engine.tickManager.TickManager tickManager, gfx.camera.GameCamera camera, entity.mobs.PlayerMob perspective) {
    projectile.draw(level.getLightLevel(((projectile.getX()) / 32), ((projectile.getY()) / 32)), camera, perspective);
}