@java.lang.Override
public <T extends net.unaussprechlich.managedgui.lib.event.util.Event> boolean doEventBus(T event) {
    if ((event.getID()) == (EnumDefaultEvents.SCALE_CHANGED.get())) {
        frameBuffer = new net.unaussprechlich.managedgui.lib.util.FrameBufferObj(((getWidth()) * (net.unaussprechlich.managedgui.lib.util.DisplayUtil.getMcScale())), ((getHeight()) * (net.unaussprechlich.managedgui.lib.util.DisplayUtil.getMcScale())), false);
    }
    return super.doEventBus(event);
}