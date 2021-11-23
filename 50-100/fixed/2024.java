public synchronized void switchEarthView() {
    if (fullEarth) {
        centerGrid.getChildren().remove(earthViewer.getLargeEarth());
        leftBarGrid.getChildren().add(earthViewer.getMiniEarth());
        fullEarth = false;
    }else {
        leftBarGrid.getChildren().remove(earthViewer.getMiniEarth());
        centerGrid.getChildren().add(earthViewer.getLargeEarth());
        earthViewer.startEarth();
        fullEarth = true;
    }
}