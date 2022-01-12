public boolean collide(core.Player player) {
    if (((java.lang.Math.abs(((x) - (player.x)))) < (core.Player.SIZE)) && ((java.lang.Math.abs(((y) - (player.y)))) < (core.Player.SIZE)))
        return true;
    
    return false;
}