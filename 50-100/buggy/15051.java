private void addToRecentProjects(java.io.File file) {
    javafx.application.Platform.runLater(() -> {
        if (((recentProjects.size()) == 0) || (!(recentProjects.get(0).equals(file.getAbsolutePath())))) {
            this.recentProjects.remove(file.getAbsolutePath());
            this.recentProjects.add(0, file.getAbsolutePath());
        }
    });
}