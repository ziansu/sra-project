public boolean collide(core.Player player) {
    if (player == (this))
        return false;
    
    if (((java.lang.Math.abs(((x) - (player.x)))) < (core.Player.SIZE)) && ((java.lang.Math.abs(((y) - (player.y)))) < (core.Player.SIZE)))
        return true;
    
    return false;
}