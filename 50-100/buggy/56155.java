protected void updateContainer(net.minecraft.inventory.IContainerListener listener) {
    if ((cookCost) != (infuser.cookCost)) {
        listener.sendProgressBarUpdate(this, 0, ((int) (infuser.cookCost)));
    }
    if ((cookTime) != (infuser.cookTime)) {
        listener.sendProgressBarUpdate(this, 1, ((int) (infuser.cookTime)));
    }
}