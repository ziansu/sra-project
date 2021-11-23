@org.junit.Test
public void root() {
    sleep(1000);
    javafx.scene.control.TreeItem<java.lang.String> root = fileExplorer.getTreeView().getRoot();
    assert root != null;
    assert root instanceof org.roda.rodain.source.ui.items.SourceTreeDirectory;
    assert ((org.roda.rodain.source.ui.items.SourceTreeDirectory) (root)).getPath().equals(org.roda.rodain.source.ui.FileExplorerPaneTest.testDir.toString());
    assert (root.getChildren().size()) == 4;
}