private void equipItem(java.awt.event.MouseEvent e) {
    model.Point pointOfSlot = this.getInventorySlot(e);
    model.TakeableItem item = inventory.getInventory().getSlot(pointOfSlot).unequip();
    item.action(avatar);
    equipment.repaint();
}