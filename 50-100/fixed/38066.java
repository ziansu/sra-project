@java.lang.Override
public void run() {
    int x = room.getTile().getCoordinateX();
    int y = room.getTile().getCoordinateY();
    leafletView.evaluateJavascript((((("panTo(" + x) + ",") + y) + ")"), null);
}