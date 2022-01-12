public synchronized void switchEarthView() {
    if (fullEarth) {
        centerGrid.getChildren().remove(earthViewer.getLargeEarth());
        leftBarGrid.getChildren().add(earthViewer.getMiniEarth());
        fullEarth = false;
    }else {
        leftBarGrid.getChildren().remove(0);
        centerGrid.getChildren().add(earthViewer.getLargeEarth());
        earthViewer.startEarth();
        fullEarth = true;
    }
}