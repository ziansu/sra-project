public void tryGiveWeapon(weapon.Weapon monsterWeapon) {
    weapon.Weapon playerWeapon = this.getWeapon();
    if (monsterWeapon != null) {
        if (playerWeapon != null) {
            if ((monsterWeapon.getDamage()) > (playerWeapon.getDamage())) {
                this.giveWeapon(monsterWeapon);
            }
        }else {
            this.giveWeapon(monsterWeapon);
        }
    }
}