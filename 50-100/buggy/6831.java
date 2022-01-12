@java.lang.Override
public void execute(com.prey.actions.observer.ActionJob actionJob, android.content.Context ctx) {
    com.prey.PreyConfig preyConfig = com.prey.PreyConfig.getPreyConfig(ctx);
    if (preyConfig.isFroyoOrAbove()) {
        preyConfig.setLock(true);
        preyConfig.setUnlockPass(getConfig().get("unlock_pass"));
        com.prey.backwardcompatibility.FroyoSupport.getInstance(ctx).changePasswordAndLock(getConfig().get("unlock_pass"), true);
    }
}