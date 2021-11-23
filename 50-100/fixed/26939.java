public void explode() {
    cn.nukkit.event.entity.EntityExplosionPrimeEvent event = new cn.nukkit.event.entity.EntityExplosionPrimeEvent(this, 4);
    server.getPluginManager().callEvent(event);
    if (event.isCancelled())
        return ;
    
    cn.nukkit.level.Explosion explosion = new cn.nukkit.level.Explosion(this, event.getForce(), this);
    if (event.isBlockBreaking())
        explosion.explodeA();
    
    explosion.explodeB();
}