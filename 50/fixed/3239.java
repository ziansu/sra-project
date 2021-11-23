@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    try {
        game.ServiceLocator.instance().getGame().terminate();
        java.lang.System.exit(0);
    } catch (java.lang.Exception ex) {
    }
}