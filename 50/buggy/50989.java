@java.lang.Override
public void mouseScrolled(org.eclipse.swt.events.MouseEvent e) {
    java.lang.String direction = ((e.count) > 0) ? "in" : "out";
    widget.zoom(direction);
}