private void loadPhotos(java.util.List<java.io.File> photosToLoad, fxapp.LoadPhotosTask task) {
    int curr = 1;
    for (java.io.File dir : photosToLoad) {
        if (dir.isDirectory()) {
            try {
                javafx.application.Platform.runLater(() -> loadPhoto(new model.Photo(dir)));
            } catch (java.lang.Exception e) {
                java.lang.System.err.println((("Error: File " + dir) + " is corrupted."));
            }
        }
        task.updateProgress(curr, photosToLoad.size());
        curr++;
    }
}