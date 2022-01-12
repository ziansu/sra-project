@com.theoriginalbit.moarperipherals.api.peripheral.annotation.function.LuaFunction
public net.minecraft.item.ItemStack getCraftingSlot(int slot) throws dan200.computercraft.api.lua.LuaException {
    --slot;
    if ((slot >= 0) && (slot < (craftingInv.getSizeInventory()))) {
        return craftingInv.getStackInSlot(slot);
    }
    return null;
}