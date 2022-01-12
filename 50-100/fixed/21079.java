public void dealDamage(int dmg) {
    if (((getDivider()) + dmg) <= (getP1Limit())) {
        killP1();
    }else
        if (((getDivider()) + dmg) >= (getP2Limit())) {
            killP2();
        }else {
            setDivider(((getDivider()) + dmg));
        }
    
}