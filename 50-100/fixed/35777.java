public void setMenu(build.games.wraithaven.gui.Menu menu) {
    if ((this.menu) == menu) {
        return ;
    }
    selectedComponent = null;
    treeDrag = null;
    mousedOver = null;
    if ((this.menu) != null) {
        this.menu.save();
        this.menu.dispose();
    }
    this.menu = menu;
    if ((this.menu) != null) {
        menu.load();
    }
    selectedComponent = null;
    repaint();
}