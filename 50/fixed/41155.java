public void actionPerformed(java.awt.event.ActionEvent e) {
    if (model.isStarted) {
        a4.gui.DevelopDialog.createAndShowDevelopDialog(model, view, false);
    }
}