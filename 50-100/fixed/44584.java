public static void UseEnderPearl() {
    if (EatingAid.instance.isEating()) {
        EatingAid.instance.StopEating();
    }
    boolean usedEnderPearlSuccessfully = com.zyin.zyinhud.util.InventoryUtil.UseItem(Items.ENDER_PEARL);
    if (!usedEnderPearlSuccessfully) {
        com.zyin.zyinhud.ZyinHUDRenderer.DisplayNotification(com.zyin.zyinhud.util.Localization.get("enderpearlaid.noenderpearls"));
    }
}