public com.kosn.entity.Item checkEquipment(java.lang.String target) {
    java.util.List<com.kosn.entity.Item> equippedItems = new java.util.ArrayList<com.kosn.entity.Item>(equipment.values());
    for (com.kosn.entity.Item checkItem : equippedItems) {
        if (checkItem.getName().equals(target)) {
            return checkItem;
        }
    }
    return null;
}