public closestPair.XyList right() {
    java.util.ArrayList<closestPair.Node> newXLx = new java.util.ArrayList<closestPair.Node>();
    java.util.ArrayList<closestPair.Node> newXLy = new java.util.ArrayList<closestPair.Node>();
    newXLx.addAll(xList.subList((((xList.size()) - 1) / 2), ((xList.size()) - 1)));
    newXLy.addAll(newXLx);
    java.util.Collections.sort(newXLy, new closestPair.XyList.yComparator());
    return new closestPair.XyList(newXLx, newXLy);
}