@java.lang.Override
public org.eclipse.smarthome.core.items.Item get(final java.lang.String itemName) {
    for (final java.util.Map.Entry<org.eclipse.smarthome.core.common.registry.Provider<org.eclipse.smarthome.core.items.Item>, java.util.Collection<org.eclipse.smarthome.core.items.Item>> entry : elementMap.entrySet()) {
        for (final org.eclipse.smarthome.core.items.Item item : entry.getValue()) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }
    }
    return null;
}