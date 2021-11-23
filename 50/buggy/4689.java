private T swapItem(int slot, T toEquip) {
    T ret = org.escaperun.game.model.entities.containers.EquipmentContainer.get(slot);
    org.escaperun.game.model.entities.containers.EquipmentContainer.add(slot, toEquip);
    return ret;
}