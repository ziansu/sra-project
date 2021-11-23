public void actionPerformed(java.awt.event.ActionEvent e) {
    gui.Load loader = new gui.Load();
    if ((loader.load()) != null)
        bm.addSpecific(loader.load());
    
    gm.refreshMainPanel();
}