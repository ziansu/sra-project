public void addRepositoryToArchive(java.lang.String archivePath, de.atilm.gitbrowser.Archive repository) {
    for (javafx.scene.control.TreeItem<de.atilm.gitbrowser.Archive> archiveItem : rootNode.getChildren()) {
        de.atilm.gitbrowser.Archive archive = archiveItem.getValue();
        archivePath = archivePath.replaceAll("\\\\", "/");
        if (archive.getPathWithSlashes().equals(archivePath)) {
            javafx.scene.control.TreeItem<de.atilm.gitbrowser.Archive> item = new javafx.scene.control.TreeItem<de.atilm.gitbrowser.Archive>(repository);
            archiveItem.getChildren().add(item);
            break;
        }
    }
}