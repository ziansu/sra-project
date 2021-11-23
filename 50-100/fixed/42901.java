public static boolean hasFoundPage(net.minecraft.entity.player.EntityPlayer player, java.lang.String page, net.minecraft.item.Item itemManual) {
    return (((player != null) && (page != null)) && ((thebetweenlands.manual.ManualManager.getFoundPages(player, itemManual)) != null)) && (thebetweenlands.manual.ManualManager.getFoundPages(player, itemManual).contains(page));
}