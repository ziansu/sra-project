@java.lang.Override
public void controlResized(org.eclipse.swt.events.ControlEvent e) {
    if ((depth) == 0) {
        (depth)++;
        tree.getVerticalBar().setEnabled(false);
        tree.getVerticalBar().setVisible(false);
        (depth)--;
    }
    fTimeGraphViewer.setHeaderHeight(tree.getHeaderHeight());
}