@java.lang.Override
public net.minecraftforge.common.capabilities.ICapabilityProvider initCapabilities(@javax.annotation.Nonnull
net.minecraft.item.ItemStack stack, @javax.annotation.Nullable
net.minecraft.nbt.NBTTagCompound nbt) {
    java.lang.System.out.println(((("initCapabilities for ItemSlimeBag with NBT = " + (stack.getTagCompound())) + " and Cap NBT = ") + nbt));
    return new com.blogspot.jabelarminecraft.examplemod.fluids.FluidHandlerSlimeBag(stack, CAPACITY);
}