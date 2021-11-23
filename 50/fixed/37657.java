@java.lang.Override
public void setupGridSystem(org.uberfire.ext.layout.editor.client.util.LayoutDragComponent... layoutDragComponents) {
    for (org.uberfire.ext.layout.editor.client.util.LayoutDragComponent layoutDragComponent : layoutDragComponents) {
        gridSystem.add(new org.uberfire.ext.layout.editor.client.dnd.DragGridElement(layoutDragComponent));
    }
}