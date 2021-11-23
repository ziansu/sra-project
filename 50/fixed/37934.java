private void appendAllLongLat(java.lang.StringBuilder wkt, inter2ohdm.OHDMNode node) {
    wkt.append(node.getLatitude());
    wkt.append(" ");
    wkt.append(node.getLongitude());
}