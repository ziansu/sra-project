@java.lang.Override
public void addListener(net.minecraft.inventory.IContainerListener listener) {
    super.addListener(listener);
    updateContainer(listener, true);
}