public void drawEdges(java.awt.Graphics2D g, Edge[] edges) {
    if (edges == null)
        return ;
    
    for (Edge e : edges) {
        if (e != null)
            g.drawLine(e.from.x, e.from.y, e.to.x, e.to.y);
        
    }
}