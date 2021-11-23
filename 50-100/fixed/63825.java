private boolean takeDamage(int i) {
    health -= i;
    if (((health) <= 0) && (!(invincible))) {
        alive = false;
        com.dig.www.character.GameCharacter.plusXP(4);
    }
    if (!(invincible))
        com.dig.www.character.GameCharacter.plusXP(i);
    
    return alive;
}