private exter.eveindustry.item.ItemStack getEffectiveProduct(exter.eveindustry.item.ItemStack product, long item_amount) {
    double efficiency = getEfficiency();
    long batches = item_amount / (refinable.getRequiredItem().amount);
    return product.scaledRounded(exter.eveindustry.util.Utils.clamp(((((double) (batches)) * efficiency) * (1 - ((tax_percent) / 100))), 0.0, java.lang.Double.MAX_VALUE));
}