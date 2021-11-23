public IT4.NPC copy() {
    IT4.NPC n = new IT4.NPC(this.initialID, this.getX(), this.getY(), this.getDirection(), this.getCurrentHealth(), this.getStatus(), this.friendly, this.getWeaponDamage(), this.getPath().copy(), this.getType());
    n.bodyArmor = this.bodyArmor;
    n.dialog = this.dialog;
    return n;
}