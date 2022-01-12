public void pathArrange() {
    pointPreProcess();
    java.util.List<UAV.entity.ChildZone> childZones = UAV.service.ExpressPathArrangeService.childZonePatition();
    createCarAndUavs(childZones);
    for (UAV.entity.ChildZone childZone : childZones) {
        java.util.List<UAV.entity.Point> czPoints = childZone.getCzPoints();
        double[][] pDis = UAV.service.ExpressPathArrangeService.getPointDisByRoad(czPoints);
        childZone.setCzPoints(((java.util.ArrayList<UAV.entity.Point>) (carPathArrange(czPoints, pDis))));
        UAVArrange(childZone);
    }
}