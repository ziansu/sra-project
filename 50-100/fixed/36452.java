public net.aufdemrand.denizencore.objects.dList flags() {
    net.aufdemrand.denizencore.objects.dList output = new net.aufdemrand.denizencore.objects.dList();
    for (org.bukkit.inventory.ItemFlag flag : item.getItemStack().getItemMeta().getItemFlags()) {
        output.add(flag.name());
    }
    return output;
}