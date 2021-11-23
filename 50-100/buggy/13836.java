@java.lang.Override
public java.util.function.BooleanSupplier parse(final net.minecraftforge.common.crafting.JsonContext context, final com.google.gson.JsonObject json) {
    java.lang.String value = net.minecraft.util.JsonUtils.getString(json, "key");
    if ((!(Configurations.gameplay.enableInDevelopmentFeatures)) && (com.minecolonies.coremod.util.ConfigCondition.SUPPLIES.equalsIgnoreCase(value))) {
        return () -> false;
    }
    if ((!(Configurations.gameplay.supplyChests)) && (com.minecolonies.coremod.util.ConfigCondition.IN_DEV.equalsIgnoreCase(value))) {
        return () -> false;
    }
    return () -> true;
}