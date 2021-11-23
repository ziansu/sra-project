private void conway() {
    for (android.graphics.Point toToggle : togglePoints()) {
        cellLoc[toToggle.y][toToggle.x].toggleLive();
    }
}