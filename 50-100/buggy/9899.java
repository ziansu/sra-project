@java.lang.Override
public void populate() {
    get().getNode("world", "inventory", "separate").setValue(true).setComment("Toggles separate inventories between worlds.");
    get().getNode("world", "inventory", "groups").setComment("Contains all world inventory groups.");
    get().getNode("world", "inventory", "groups", "example").setValue("world, DIM1, DIM-1").setComment("Example world inventory group.");
    get().getNode("world", "weather", "locked").setComment("Worlds listed here, will not change weather.");
}