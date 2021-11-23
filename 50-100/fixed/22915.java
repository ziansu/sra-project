public void addPoly(java.util.List<java.awt.geom.Point2D.Double> vertices, boolean closed, boolean filled, java.awt.Color color) {
    synchronized(polys) {
        if (color != null)
            polyColor = dupColor(color);
        
        if (polys.add(new com.github.rosjava.challenge.gui.MapGUIPanel.Poly(vertices, closed, filled, polyColor))) {
            java.lang.System.err.println((("GUI: added poly with " + (vertices.size())) + " verts"));
        }
    }
    repaint();
}