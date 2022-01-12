@java.lang.Override
public void redo() {
    wire1.addWireToScene(scene);
    wire1.undoRemoveWire();
    wire1.connect();
    if ((wire2) != null) {
        wire2.addWireToScene(scene);
        wire2.undoRemoveWire();
        wire2.disconnect();
    }
    this.scene.updateTreeView(wire1.getTreePinStart(), wire1.getTreePinEnd());
}