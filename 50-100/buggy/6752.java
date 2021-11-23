private java.util.List<java.lang.Integer> getColorsList(final java.util.List<simulator.common.graphic.Point> pointList) {
    java.util.List<java.lang.Integer> colorsList = new java.util.ArrayList(pointList.size());
    for (simulator.common.graphic.Point point : pointList) {
        colorsList.add(point.getColor().getValue());
    }
    return colorsList;
}