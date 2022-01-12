protected void updateContainer(net.minecraft.inventory.IContainerListener listener, boolean add) {
    if (add || ((cookCost) != (infuser.cookCost))) {
        listener.sendProgressBarUpdate(this, 0, ((int) (infuser.cookCost)));
    }
    if (add || ((cookTime) != (infuser.cookTime))) {
        listener.sendProgressBarUpdate(this, 1, ((int) (infuser.cookTime)));
    }
}