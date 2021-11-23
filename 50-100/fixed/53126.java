public void attackB(Player player, int count) {
    int damage;
    if ((super.d20()) > 8) {
        damage = (super.d6()) * count;
        java.lang.System.out.println((((("The " + (name)) + " attacks you for ") + damage) + " damage."));
        player.takeDamage(damage);
    }else {
        damage = 0;
        java.lang.System.out.println((("The " + (name)) + " misses with his attack."));
    }
}