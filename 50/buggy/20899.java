@java.lang.Override
@Optional.Method(modid = "tconstruct")
public boolean isTinkersWeapon(@org.jetbrains.annotations.NotNull
final net.minecraft.item.ItemStack stack) {
    return (!(com.minecolonies.api.util.ItemStackUtils.isEmpty(stack))) && ((stack.getItem()) instanceof slimeknights.tconstruct.library.tools.SwordCore);
}