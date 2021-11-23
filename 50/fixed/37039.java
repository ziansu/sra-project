@java.lang.Override
public int hit(int armor) {
    int damage = (DAMAGE) - ((armor * 20) / 100);
    if (damage < 0) {
        return 0;
    }
    return damage;
}