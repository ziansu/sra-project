private javafx.scene.control.TreeView buildFileSystemBrowser() {
    javafx.scene.control.TreeItem<java.io.File> root = createNode(f);
    return new javafx.scene.control.TreeView<java.io.File>(root);
}