public boolean takeDamage(int damage) {
    health -= damage;
    damageFrames += 30;
    name.replaceAll("Dmg", "");
    setName(((name) + "Dmg"));
    if ((health) <= 0)
        return true;
    else
        return false;
    
}