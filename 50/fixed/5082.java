public void tick() {
    if ((Game.player.getX()) <= ((Game.WIDTH) / 2))
        return ;
    else
        x = (-(Game.player.getX())) + ((Game.WIDTH) / 2);
    
}