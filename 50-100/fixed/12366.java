@java.lang.Override
public int getZoneIdx(playground.michalm.zone.util.Node node) {
    org.matsim.api.core.v01.Coord coord = node.getCoord();
    int r = ((int) (java.lang.Math.round((((coord.getY()) - (y0)) / (cellSize)))));
    int c = ((int) (java.lang.Math.round((((coord.getX()) - (x0)) / (cellSize)))));
    return (r * (cols)) + c;
}