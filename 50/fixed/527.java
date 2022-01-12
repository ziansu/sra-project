@java.lang.Override
public int hit(int armor) {
    int damage = (DAMAGE) - (java.lang.Math.round((0.8F * armor)));
    if (damage < 0) {
        return 0;
    }
    return damage;
}