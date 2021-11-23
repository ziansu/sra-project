@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    com.editor.model.Pointer mouseClickedPointer = new com.editor.model.Pointer(e.getY(), e.getX());
    java.lang.System.out.println(("Mouse clicked on: " + mouseClickedPointer));
}