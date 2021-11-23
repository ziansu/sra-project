final void dropPowerUp() {
    char ballsize = ((this.getRadius()) > 20) ? 'b' : 's';
    switch (ballsize) {
        case 'b' :
            game.Level.addPowerUp(new powerups.MovementPowerUp(posx, posy));
            break;
        case 's' :
            game.Level.addPowerUp(new powerups.FastArrowPowerUp(posx, posy));
        default :
            game.Level.addPowerUp(new powerups.FastArrowPowerUp(posx, posy));
            break;
    }
}