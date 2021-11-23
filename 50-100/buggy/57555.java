@java.lang.Override
public void mouseMove(org.eclipse.swt.events.MouseEvent e) {
    if ((offset[0]) != null) {
        java.lang.System.out.println(("Mouse move event for: " + (classes[currentClassId])));
        org.eclipse.swt.graphics.Point pt = offset[0];
        currentClassButton.setLocation(((e.x) - (pt.x)), ((e.y) - (pt.y)));
    }
}