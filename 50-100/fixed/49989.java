public org.eclipse.smarthome.core.items.Item remove(java.lang.String itemName, boolean recursive) {
    org.eclipse.smarthome.core.items.Item item = get(itemName);
    if (recursive && (item instanceof org.eclipse.smarthome.core.items.GroupItem)) {
        java.util.List<java.lang.String> members = getMemberNamesRecursively(((org.eclipse.smarthome.core.items.GroupItem) (item)), getAll());
        for (java.lang.String member : members) {
            this.remove(member);
        }
    }
    if (item != null) {
        this.remove(item.getName());
        return item;
    }else {
        return null;
    }
}