@java.lang.Override
public boolean visit(com.helpme.app.item.Consumable consumable) {
    if (inventory.hasItem(consumable)) {
        inventory.addStack(consumable);
    }
    return false;
}