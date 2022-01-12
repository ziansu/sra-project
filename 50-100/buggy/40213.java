public void paint(java.awt.Graphics2D gc, java.awt.Rectangle rect) {
    if (!(inUpdate)) {
        try {
            if (gc instanceof megan.chart.gui.SelectionGraphics) {
                final megan.chart.gui.SelectionGraphics sgc = ((megan.chart.gui.SelectionGraphics) (gc));
                select(rect, sgc.getSelectionRectangle(), sgc.getMouseClicks());
            }else
                doPaint(gc, rect);
            
        } catch (java.lang.Exception ex) {
        }
    }
}