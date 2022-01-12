public int hit(int armor) {
    int damage;
    if ((armor > 0) && (armor < 20)) {
        damage = this.DAMAGE;
    }else {
        damage = (this.DAMAGE) - armor;
    }
    return damage < 0 ? 0 : damage;
}