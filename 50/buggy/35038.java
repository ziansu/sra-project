@java.lang.Override
public java.util.function.BooleanSupplier parse(net.minecraftforge.common.crafting.JsonContext context, com.google.gson.JsonObject json) {
    return () -> com.mcmoddev.lib.util.ConfigBase.Options.disableAllHammerRecipes();
}