@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    java.lang.System.out.println(e);
    if ((e.getClickCount()) == 2) {
        insertSelection();
    }
}