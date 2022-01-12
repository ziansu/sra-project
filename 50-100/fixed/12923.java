public com.kosn.entity.Item checkEquipment(java.lang.String target) {
    java.util.List<com.kosn.entity.Item> equippedItems = new java.util.ArrayList<com.kosn.entity.Item>(equipment.values());
    for (com.kosn.entity.Item checkItem : equippedItems) {
        if (checkItem.getName().equals(target)) {
            return checkItem;
        }
    }
    for (com.kosn.entity.Item checkItem : equippedItems) {
        if (checkItem.getName().startsWith(target)) {
            return checkItem;
        }
    }
    return null;
}