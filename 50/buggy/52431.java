@java.lang.Override
public void markDirty() {
    if (!(Proxies.common.isSimulating(player.worldObj))) {
        return ;
    }
    tryImprint();
}