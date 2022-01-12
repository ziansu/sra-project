private void updateShowLinksArea() {
    float oldArea = java.lang.Math.abs(((showLinksInterval.y) - (showLinksInterval.x)));
    float change = (arcHighlightArea) - oldArea;
    showLinksInterval.x -= change / 2;
    showLinksInterval.y += change / 2;
    clampShowLinksInterval();
}