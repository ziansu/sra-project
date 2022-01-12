public void tryGiveWeapon(weapon.Weapon monsterWeapon) {
    weapon.Weapon playerWeapon = getWeapon();
    if (monsterWeapon != null) {
        if (playerWeapon != null) {
            if ((monsterWeapon.getDamage()) > (playerWeapon.getDamage())) {
                giveWeapon(monsterWeapon);
            }
        }else {
            giveWeapon(monsterWeapon);
        }
    }
}