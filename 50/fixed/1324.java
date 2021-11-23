public void closeMailbox(no.runsafe.framework.api.player.IPlayer viewer) {
    if (this.isViewingMailbox(viewer)) {
        this.openMailboxes.remove(viewer);
        viewer.closeInventory();
    }
}