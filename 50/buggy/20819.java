public void setGUI(me.legopal92.gamblr.menu.MainMenu gui) {
    this.gui = gui;
    me.legopal92.gamblr.Gamblr.getInstance().getDealerConfig().set(this);
}