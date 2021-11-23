@java.lang.Override
public void disable() {
    for (java.util.Map.Entry<java.util.UUID, java.util.List<java.lang.String>> entry : inventoryMap.entrySet()) {
        dataFile.set(entry.getKey().toString(), entry.getValue());
    }
    org.bukkit.event.HandlerList.unregisterAll(((org.bukkit.event.Listener) (this)));
}