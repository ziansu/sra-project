@java.lang.Override
public void keyPressed(java.awt.event.KeyEvent e) {
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_ESCAPE)) {
        if ((promptMsg) != null) {
            promptMsg = null;
            repaint();
            return ;
        }
        hasFinished = canceled = true;
        org.sikuli.basics.Debug.log(3, "CapturePrompt: aborted using key ESC");
        setVisible(false);
        notifyObserver();
    }
}