@java.lang.Override
public float getSaturationModifier(@javax.annotation.Nonnull
net.minecraft.item.ItemStack stack) {
    com.girafi.culinarycultivation.item.ItemCropProduct.ProductType productType = com.girafi.culinarycultivation.item.ItemCropProduct.ProductType.byItemStack(stack);
    switch (type) {
        case CROP :
            return productType.getCropSaturation();
        case CROP_COOKED :
            return productType.getCookedSaturation();
        default :
            return super.getSaturationModifier(stack);
    }
}