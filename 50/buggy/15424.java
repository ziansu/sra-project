@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        gui.AddFlashcardDialog d = new gui.AddFlashcardDialog(this, project, projPnl);
        d.setVisible(true);
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
}