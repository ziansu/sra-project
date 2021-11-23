public void actionPerformed(java.awt.event.ActionEvent e) {
    gui.Load loader = new gui.Load();
    bm.addSpecific(loader.load());
    gm.refreshMainPanel();
}