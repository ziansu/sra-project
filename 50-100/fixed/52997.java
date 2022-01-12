private void addOverload(float amt) {
    if (getEntity().capabilities.isCreativeMode)
        return ;
    
    curOverload = java.lang.Math.min(getMaxOverload(), ((curOverload) + amt));
    untilOverloadRecover = getInt("overload_recover_cooldown");
    if ((curOverload) == (getMaxOverload())) {
        MinecraftForge.EVENT_BUS.post(new cn.academy.ability.api.data.OverloadEvent(getEntity()));
        overloadFine = false;
    }
    if (!(isClient()))
        dataDirty = true;
    
}