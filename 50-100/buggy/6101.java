@java.lang.Override
public boolean softMatch(net.minecraft.item.ItemStack stack) {
    if (stack == null) {
        return false;
    }
    for (int ID : net.minecraftforge.oredict.OreDictionary.getOreIDs(stack)) {
        if ((net.minecraftforge.oredict.OreDictionary.getOreName(ID)) == (oreDict)) {
            return true;
        }
    }
    return false;
}