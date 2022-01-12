public static com.google.android.gms.maps.model.LatLng[] createOptimizedSurveyRoute(com.google.android.gms.maps.model.LatLng[] points, float altitude) {
    if (com.jarone.litterary.RouteOptimization.validateBoundary(points)) {
        org.nd4j.linalg.api.ndarray.INDArray picturePoints = com.jarone.litterary.RouteOptimization.getPhotoPoints(com.jarone.litterary.RouteOptimization.array);
        org.nd4j.linalg.api.ndarray.INDArray orderedPoints = com.jarone.litterary.RouteOptimization.optimizePhotoRoute(picturePoints);
        com.google.android.gms.maps.model.LatLng[] route = new com.google.android.gms.maps.model.LatLng[20];
        return points;
    }else {
        com.jarone.litterary.handlers.MessageHandler.d("Boundary Points Are Too Far From Drone!");
        return new com.google.android.gms.maps.model.LatLng[0];
    }
}