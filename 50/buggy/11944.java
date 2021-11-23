@java.lang.Override
public void invalidate() {
    super.invalidate();
    network.kill();
    com.builtbroken.mc.lib.world.radio.RadioRegistry.remove(this);
}