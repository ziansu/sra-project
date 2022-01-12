public static void clearAll() {
    vrg.VRGwithTimeWindow.clearRoutess();
    vrg.VRGwithTimeWindow.carsWeight.clear();
    vrg.VRGwithTimeWindow.coordinates.clear();
    vrg.VRGwithTimeWindow.lengthOfRoutes.clear();
    vrg.VRGwithTimeWindow.allIndexes.clear();
    vrg.VRGwithTimeWindow.routes.clear();
    vrg.VRGwithTimeWindow.table.clear();
    vrg.VRGwithTimeWindow.optimalPoint = vrg.VRGwithTimeWindow.PointT.C.OptimalPoint.OptimalTime;
    vrg.VRGwithTimeWindow.generateRoutess();
}