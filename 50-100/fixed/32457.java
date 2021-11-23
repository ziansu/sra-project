private void appendAllLongLat(java.lang.StringBuilder wkt) {
    java.util.Iterator<inter2ohdm.OHDMNode> nodeIter = this.getNodeIter();
    boolean first = true;
    while (nodeIter.hasNext()) {
        if (first) {
            first = false;
        }else {
            wkt.append(", ");
        }
        inter2ohdm.OHDMNode node = nodeIter.next();
        this.appendAllLongLat(wkt, node);
    } 
}