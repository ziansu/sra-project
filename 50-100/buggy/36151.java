private void updateShowLinksArea() {
    float oldArea = java.lang.Math.abs(((showLinksInterval.y) - (showLinksInterval.x)));
    java.lang.System.out.println(("Old : " + oldArea));
    java.lang.System.out.println(("AHA : " + (arcHighlightArea)));
    float change = (arcHighlightArea) - oldArea;
    java.lang.System.out.println(("Change : " + oldArea));
    showLinksInterval.x += change / 2;
    showLinksInterval.y -= change / 2;
    clampShowLinksInterval();
}