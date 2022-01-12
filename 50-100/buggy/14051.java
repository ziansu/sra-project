public void visit(org.openstreetmap.josm.data.osm.Node n1, org.openstreetmap.josm.data.osm.Node n2) {
    java.awt.Point p1 = nc.getPoint(n1);
    java.awt.Point p2 = nc.getPoint(n2);
    g.drawLine(p1.x, p1.y, p2.x, p2.y);
}