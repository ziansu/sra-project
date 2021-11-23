public void remove(java.lang.String itemName, boolean recursive) {
    org.eclipse.smarthome.core.items.Item item = get(itemName);
    if (recursive && (item instanceof org.eclipse.smarthome.core.items.GroupItem)) {
        java.util.List<java.lang.String> members = getMemberNamesRecursively(((org.eclipse.smarthome.core.items.GroupItem) (item)), getAll());
        for (java.lang.String member : members) {
            this.remove(member);
        }
    }
    this.remove(item.getName());
}