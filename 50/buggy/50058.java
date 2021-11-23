private javafx.scene.control.TreeView buildFileSystemBrowser() {
    javafx.scene.control.TreeItem<java.io.File> root = createNode(new java.io.File("workspace"));
    return new javafx.scene.control.TreeView<java.io.File>(root);
}