@java.lang.Override
public void invalidate() {
    super.invalidate();
    if ((network) != null) {
        network.kill();
    }
    com.builtbroken.mc.lib.world.radio.RadioRegistry.remove(this);
}