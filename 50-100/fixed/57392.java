public void attackD(Player player, int count) {
    int damage;
    if ((super.d20()) > 15) {
        damage = (super.d8()) * count;
        java.lang.System.out.println((((("The " + (name)) + " attacks you for ") + damage) + " damage."));
        player.takeDamage(damage);
    }else {
        damage = 0;
        java.lang.System.out.println("The monster misses with his attack.");
    }
}