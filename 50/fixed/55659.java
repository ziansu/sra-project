@java.lang.Override
public void onClosed() {
    if (!(basic.getStackInSlot(0).isEmpty())) {
        player.dropItem(basic.getStackInSlot(0), false);
    }
}