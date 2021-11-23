public org.bukkit.inventory.ItemStack render(double multiplier) {
    org.bukkit.inventory.ItemStack is = template.clone();
    is.setAmount(((int) (java.lang.Math.round((((double) (is.getAmount())) * multiplier)))));
    if ((is.getAmount()) > (is.getMaxStackSize())) {
        is.setAmount(is.getMaxStackSize());
    }
    return is;
}