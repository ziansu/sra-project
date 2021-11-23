public void turn() {
    updateProx();
    wander();
    if (((xProx) <= 32) && ((yProx) <= 32)) {
        attack(pCharacter);
    }else
        if (((xProx) <= ((com.mygdx.game.Undead.CHASE_TETHER) * 32)) && ((yProx) <= ((com.mygdx.game.Undead.CHASE_TETHER) * 32))) {
            chase();
        }else {
            wander();
        }
    
}