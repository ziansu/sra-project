@stanhebben.zenscript.annotations.ZenMethod
public static void addRecipe(minetweaker.api.item.IItemStack output, minetweaker.api.item.IIngredient input1, int ticktime, int euTick) {
    net.minecraft.item.ItemStack oInput1 = ((net.minecraft.item.ItemStack) (techreborn.compat.minetweaker.MinetweakerCompat.toObject(input1)));
    techreborn.api.recipe.machines.PlateCuttingMachineRecipe r = new techreborn.api.recipe.machines.PlateCuttingMachineRecipe(oInput1, techreborn.compat.minetweaker.MinetweakerCompat.toStack(output), ticktime, euTick);
    minetweaker.MineTweakerAPI.apply(new techreborn.compat.minetweaker.MTPlateCuttingMachine.Add(r));
}