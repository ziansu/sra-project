private void displayHome() {
    this.statusBar.drawInventory(this.statusBar.createInventoryArea());
    this.statusBar.drawControl(createHigScore());
    centerScreen();
}