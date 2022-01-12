@java.lang.Override
public void activate(nl.tudelft.model.Player player) {
    if (!(isActive())) {
        setActive(true);
        this.player = player;
        if (player.hasPowerup(Powerup.SHOPSHIELD)) {
            return ;
        }
        if (player.hasPowerup(Powerup.SHIELD)) {
            player.removePowerup(Powerup.SHIELD).toRemove();
        }
        if (!(player.hasPowerup(Powerup.INVINCIBLE))) {
            player.setPowerup(Powerup.SHIELD, this);
        }else {
            toRemove();
        }
    }
}