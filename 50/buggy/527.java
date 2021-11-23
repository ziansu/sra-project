@java.lang.Override
public int hit(int armor) {
    int damage = (DAMAGE) - (0.8F * armor);
    if (damage < 0) {
        return 0;
    }
    return damage;
}