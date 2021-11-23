@java.lang.Override
public void setCanceled(boolean canceled) {
    super.setCanceled(canceled);
    useBlock = net.minecraftforge.fml.common.eventhandler.Event.Result.DENY;
    useItem = net.minecraftforge.fml.common.eventhandler.Event.Result.DENY;
}