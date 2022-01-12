public void lock(android.content.Context ctx, java.lang.String unlock) {
    if (com.prey.PreyConfig.getPreyConfig(ctx).isFroyoOrAbove()) {
        com.prey.PreyConfig.getPreyConfig(ctx).setLock(true);
        com.prey.backwardcompatibility.FroyoSupport.getInstance(ctx).changePasswordAndLock(unlock, true);
        com.prey.net.PreyWebServices.getInstance().sendNotifyActionResultPreyHttp(ctx, com.prey.json.UtilJson.makeMapParam("start", "lock", "started"));
        com.prey.PreyConfig.getPreyConfig(ctx).setLastEvent("lock_started");
    }
}