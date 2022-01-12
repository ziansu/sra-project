private boolean vehicleHasFood() {
    if ((vehicle) != null) {
        for (model.Item.ITEM_TYPE itemType : vehicle.getInventory().getPopulatedSlots()) {
            if (itemType.isFood()) {
                return true;
            }
        }
    }
    return false;
}