public void run() {
    if ((data_loaded) == false) {
        zoomToMyLocation();
    }else {
        zoomToPoints();
    }
    progress.dismiss();
}