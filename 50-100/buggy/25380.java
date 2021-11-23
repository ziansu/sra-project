public static void potionExpiredHook(net.minecraft.entity.EntityLivingBase entity, net.minecraft.potion.PotionEffect effect) {
    if (!(org.winterblade.minecraft.harmony.entities.callbacks.ApplyPotionCallback.potionHandlers.containsKey(entity)))
        return ;
    
    java.util.Map<net.minecraft.potion.Potion, org.winterblade.minecraft.harmony.entities.callbacks.ApplyPotionCallback.HarmonyPotionEffect> effectMap = org.winterblade.minecraft.harmony.entities.callbacks.ApplyPotionCallback.potionHandlers.get(entity);
    if (!(effectMap.containsKey(effect.getPotion())))
        return ;
    
    effectMap.remove(effect.getPotion()).onRemoved(entity, false);
    if ((effectMap.size()) <= 0)
        org.winterblade.minecraft.harmony.entities.callbacks.ApplyPotionCallback.potionHandlers.remove(entity);
    
    return ;
}