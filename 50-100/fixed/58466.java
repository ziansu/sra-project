public void killZombies() {
    java.util.Iterator<avs.models.Zombie> iter = avs.models.Game.getInstance().getZombieList().iterator();
    while (iter.hasNext()) {
        avs.models.Zombie z = iter.next();
        if (z == null)
            continue;
        
        if ((deathZone.intersects(z.getBounds())) || (deathZone.contains(z.getBounds()))) {
            z.kill();
        }
    } 
}