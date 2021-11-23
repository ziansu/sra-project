public void addRepositoryToArchive(java.lang.String archivePath, de.atilm.gitbrowser.Archive repository) {
    for (javafx.scene.control.TreeItem<de.atilm.gitbrowser.Archive> archiveItem : rootNode.getChildren()) {
        de.atilm.gitbrowser.Archive archive = archiveItem.getValue();
        if ((archive.getPathWithSlashes()) == (archivePath.replaceAll("\\\\", "/"))) {
            javafx.scene.control.TreeItem<de.atilm.gitbrowser.Archive> item = new javafx.scene.control.TreeItem<de.atilm.gitbrowser.Archive>(repository);
            archiveItem.getChildren().add(item);
            break;
        }
    }
}