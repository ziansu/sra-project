@java.lang.Override
public void run() {
    if (!(currentFloor.equals(room.getFloor())))
        showFloor(room.getFloor());
    
    int x = room.getTile().getCoordinateX();
    int y = room.getTile().getCoordinateY();
    leafletView.evaluateJavascript((((("panTo(" + x) + ",") + y) + ")"), null);
}