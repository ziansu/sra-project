public void removeLastPoint() {
    if ((listOfPoints.size()) == 1) {
        totalDistance = 0.0;
    }else {
        com.nathankrebs.runningmap.Model.CustomMarker removedMarker = listOfPoints.removeLast();
        map.clear();
        for (com.nathankrebs.runningmap.Model.CustomMarker marker : listOfPoints) {
            map.addMarker(marker.getMarker());
            if ((marker.getPolyLine()) != null) {
                map.addPolyline(marker.getPolyLine());
            }
        }
        totalDistance = listOfPoints.getLast().getDistToMark();
    }
}