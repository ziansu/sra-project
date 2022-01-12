private static void updateIndexes(com.usda.fmsc.twotrails.data.DataAccessLayer dal) {
    java.util.ArrayList<com.usda.fmsc.twotrails.objects.points.TtPoint> savePoints = new java.util.ArrayList<>();
    for (com.usda.fmsc.twotrails.objects.TtPolygon poly : dal.getPolygons()) {
        int index = 0;
        for (com.usda.fmsc.twotrails.objects.points.TtPoint point : dal.getPointsInPolygon(poly.getCN())) {
            if ((point.getIndex()) != index) {
                point.setIndex(index);
                savePoints.add(point);
            }
            index++;
        }
    }
    dal.updatePoints(savePoints, savePoints);
}