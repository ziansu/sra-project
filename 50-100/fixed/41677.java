public boolean takeDamage(int damage) {
    health -= damage;
    damageFrames += 30;
    setName(((name.replaceAll("Dmg", "")) + "Dmg"));
    if ((health) <= 0)
        return true;
    else
        return false;
    
}