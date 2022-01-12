@java.lang.Override
public int compare(trafficsimulator.core.Road o1, trafficsimulator.core.Road o2) {
    java.util.List<trafficsimulator.utils.Point> cPoints1 = junction.getPointsForRoad(o1);
    java.util.List<trafficsimulator.utils.Point> cPoints2 = junction.getPointsForRoad(o2);
    trafficsimulator.utils.Point cPoint1 = trafficsimulator.utils.Point.centroid(cPoints1);
    trafficsimulator.utils.Point cPoint2 = trafficsimulator.utils.Point.centroid(cPoints2);
    trafficsimulator.gui.SimulationRenderer.PointCWComparator comparator = new trafficsimulator.gui.SimulationRenderer.PointCWComparator(junction.getCenterPoint());
    return comparator.compare(cPoint1, cPoint2);
}