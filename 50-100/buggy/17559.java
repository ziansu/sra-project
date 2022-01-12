@java.lang.Override
public int hit(int armor) {
    if ((armor > 0) && (armor < 20)) {
        int damage = DAMAGE;
    }else {
        int damage = (DAMAGE) - armor;
    }
    if ((damage) < 0) {
        return 0;
    }
    return damage;
}