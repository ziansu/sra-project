@java.lang.Override
public int hit(int armor) {
    int damage;
    if ((armor > 0) && (armor < 20))
        damage = ((DAMAGE) - armor) + armor;
    else
        damage = (DAMAGE) - armor;
    
    if (damage < 0) {
        return 0;
    }
    return damage;
}