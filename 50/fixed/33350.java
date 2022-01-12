@java.lang.Override
public void signalLockError() {
    minetweaker.MineTweakerAPI.getLogger().logError("Reload of scripts blocked (script lock)");
    if (net.minecraft.client.Minecraft.isGuiEnabled()) {
    }
}