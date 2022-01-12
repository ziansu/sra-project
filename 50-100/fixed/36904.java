@java.lang.Override
public int getHealAmount(@javax.annotation.Nonnull
net.minecraft.item.ItemStack stack) {
    com.girafi.culinarycultivation.item.ItemCropProduct.ProductType productType = com.girafi.culinarycultivation.item.ItemCropProduct.ProductType.byItemStack(stack);
    switch (type) {
        case CROP :
            return productType.getCropHunger();
        case CROP_COOKED :
            return productType.getCookedHunger();
        default :
            return 0;
    }
}