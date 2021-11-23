public boolean loseHitPoint(int dmg) {
    hitPoints -= dmg;
    if ((hitPoints) <= 0)
        return true;
    
    return false;
}