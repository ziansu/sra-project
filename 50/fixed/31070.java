private void appendAllLongLat(java.lang.StringBuilder wkt, inter2ohdm.OSMNode node) {
    wkt.append(node.getLongitude());
    wkt.append(" ");
    wkt.append(node.getLatitude());
}