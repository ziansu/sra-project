public java.util.List<com.google.android.gms.maps.model.LatLng> listNodeCoordinates(java.util.List<com.example.nspace.museedesondes.model.Node> nodes, int floorID) {
    if (nodes == null) {
        return null;
    }
    java.util.List<com.google.android.gms.maps.model.LatLng> nodeLatLngs = new java.util.ArrayList<com.google.android.gms.maps.model.LatLng>();
    for (com.example.nspace.museedesondes.model.Node node : nodes) {
        if ((node.getFloorID()) == floorID) {
            nodeLatLngs.add(new com.google.android.gms.maps.model.LatLng(node.getY(), node.getX()));
        }
    }
    return nodeLatLngs;
}