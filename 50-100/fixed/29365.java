public boolean fire(component.Bullet bullet) {
    if ((bullets.size()) >= (component.Tank.MAX_BULLETS))
        return false;
    
    bullet.setMap(getMap());
    bullets.add(bullet);
    if ((map) != null)
        map.add(bullet);
    
    return true;
}