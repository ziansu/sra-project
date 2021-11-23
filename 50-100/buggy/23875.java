public static boolean checkWeapon(java.util.UUID pUsername, java.lang.String pSelector, net.minecraft.item.ItemStack pItemStack) {
    if (!(net.blacklab.lmr.util.TriggerSelect.selector.contains(pSelector))) {
        return false;
    }
    if (net.blacklab.lmr.util.helper.CommonHelper.isLocalPlay()) {
        return net.blacklab.lmr.util.TriggerSelect.getuserTriggerList(null, pSelector).contains(pItemStack.getItem());
    }
    if (!(net.blacklab.lmr.util.TriggerSelect.usersTrigger.containsKey(pUsername))) {
        return false;
    }
    return net.blacklab.lmr.util.TriggerSelect.getuserTriggerList(pUsername, pSelector).contains(pItemStack.getItem());
}