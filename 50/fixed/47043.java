@java.lang.Override
@javax.annotation.Nonnull
public java.lang.String getUnlocalizedName(net.minecraft.item.ItemStack itemStack) {
    return org.halvors.nuclearphysics.common.utility.LanguageUtility.transelate((((super.getUnlocalizedName(itemStack)) + ".") + (itemStack.getMetadata())));
}