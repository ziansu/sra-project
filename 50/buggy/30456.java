public boolean loseHitPoint(int dmg) {
    java.lang.System.out.println(hitPoints);
    hitPoints -= dmg;
    if ((hitPoints) <= 0)
        return true;
    
    return false;
}