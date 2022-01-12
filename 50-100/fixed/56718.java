@java.lang.Override
public boolean isValidInput(net.minecraft.item.ItemStack input) {
    if ((input != null) && ((this.input.getItemDamage()) == (net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE))) {
        return (this.input.getItem()) == (input.getItem());
    }
    return net.minecraft.item.ItemStack.areItemsEqual(this.input, input);
}