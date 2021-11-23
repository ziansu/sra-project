@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    this.dispose();
    grimoire.Grimoire.stop();
}