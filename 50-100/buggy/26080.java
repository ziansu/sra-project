private void addConsumableToInventory(wzrdfrm.manager.Consumable newConsumable) {
    wzrdfrm.manager.Consumable matchingConsumable = org.apache.commons.collections4.IterableUtils.find(farm.getConsumableInventory(), (wzrdfrm.manager.Consumable consumable) -> consumable.getUsableItem().getId().equals(newConsumable.getUsableItem().getId()));
    if (matchingConsumable == null) {
        farm.getConsumableInventory().add(newConsumable);
    }else {
        matchingConsumable.setQuantity(((matchingConsumable.getQuantity()) + (newConsumable.getQuantity())));
    }
}