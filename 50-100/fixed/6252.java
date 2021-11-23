@org.terasology.entitySystem.event.ReceiveEvent(components = org.terasology.logic.inventory.ItemComponent.class, priority = org.terasology.entitySystem.event.EventPriority.PRIORITY_TRIVIAL)
public void usedItem(org.terasology.hunger.event.FoodConsumedEvent event, org.terasology.entitySystem.entity.EntityRef item) {
    org.terasology.logic.inventory.ItemComponent itemComp = item.getComponent(org.terasology.logic.inventory.ItemComponent.class);
    if (itemComp.consumedOnUse) {
        int slot = org.terasology.logic.inventory.InventoryUtils.getSlotWithItem(event.getInstigator(), item);
        destroyDrink = false;
        if ((itemComp.baseDamage) != (java.lang.Integer.MIN_VALUE)) {
            itemComp.baseDamage = java.lang.Integer.MIN_VALUE;
        }else {
            destroyDrink = true;
            itemComp.baseDamage = 1;
        }
    }
}