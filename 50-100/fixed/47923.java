public void equip(models.Entity.Entity entity, models.Equipment.Equipment equipment, models.Inventory.Inventory inventory) {
    if ((requirement.meetsRequirements(entity)) == false) {
        java.lang.System.out.println(((("Can't Equip! You must be a " + (requirement.getRequiredOccupation())) + " over level ") + (requirement.getRequiredLevel())));
        return ;
    }
    if (equipment.setEquippedWeapon(this)) {
        inventory.removeItem(id);
        this.applyBuffs(entity);
    }
}