@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    selectThis(((javax.swing.JTextArea) (e.getComponent())));
    for (java.lang.String x : Main.window.p.notFrom) {
        if (((javax.swing.JTextArea) (e.getComponent())).getText().equals(x)) {
            PeoplePanel.notFrom.remove(x);
            TAListener.highlightUpdate();
            break;
        }
    }
}