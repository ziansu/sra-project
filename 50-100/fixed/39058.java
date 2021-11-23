@java.lang.Override
public void disable() {
    for (java.util.Map.Entry<java.util.UUID, java.lang.String> entry : inventoryMap.entrySet()) {
        dataFile.set(entry.getKey().toString(), entry.getValue());
    }
    dataFile.save();
    org.bukkit.event.HandlerList.unregisterAll(((org.bukkit.event.Listener) (this)));
}