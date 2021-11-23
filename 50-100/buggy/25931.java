@java.lang.Override
public void load(net.minecraftforge.common.config.Configuration config, boolean isReload) {
    loadAll();
    enabled = config.get("PermissionScheduler", "enabled", false, com.forgeessentials.permissions.core.PermissionScheduler.HELP).getBoolean();
    if (com.forgeessentials.util.ServerUtil.isServerRunning()) {
        if (enabled)
            register();
        else
            unregister();
        
    }
}