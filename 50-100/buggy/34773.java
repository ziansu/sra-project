public boolean canEquip(java.lang.String id, ca.thederpygolems.armorequip.ArmorEquipEvent.ArmorType type) {
    if (type == null) {
        return true;
    }
    if (lastEquip.containsKey(id)) {
        if (lastEquip.get(id).containsKey(type)) {
            if (((java.lang.System.currentTimeMillis()) - (lastEquip.get(id).get(type))) > 500) {
                return true;
            }
        }
    }
    return false;
}