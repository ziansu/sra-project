@java.lang.Override
public boolean onLongPressOnMap(android.graphics.Point point) {
    com.my.fly.utilities.WayPoint wayPoint = new com.my.fly.utilities.WayPoint(routeView.TranslateScreenPointToGeoPoint(point));
    route.AddWayPoint(wayPoint);
    routeView.AddWayPoint(wayPoint, route.GetWayPoints().size());
    routeView.SetViewPoint(route.viewPoint.coord);
    BuildTask(false);
    SaveRoute();
    return false;
}