public void drawEdges(java.awt.Graphics2D g, Edge[] edges) {
    if (edges == null)
        return ;
    
    for (Edge e : edges) {
        if (e != null)
            g.drawLine(e.from.getX(), e.from.getY(), e.to.getX(), e.to.getY());
        
    }
}