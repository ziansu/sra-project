public float getPullingAnimationProgress(net.minecraft.item.ItemStack bow, net.minecraft.entity.EntityLivingBase archer) {
    float animationProgress = ((bow != null) && (archer != null)) ? ((float) ((bow.getMaxItemUseDuration()) - (archer.getItemInUseCount()))) / 20.0F : 0.0F;
    return ((float) (animationProgress *= pullingSpeedMult)) > 1.0F ? 1.0F : animationProgress;
}