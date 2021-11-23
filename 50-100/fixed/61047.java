public void mouseDragged(java.awt.event.MouseEvent e) {
    if ((dragging) != (-1)) {
        try {
            if ((dragging) < (sample_points.size())) {
                sample_points.set(dragging, trans.inverseTransform(e.getPoint(), null));
            }
        } catch (java.awt.geom.NoninvertibleTransformException ex) {
            java.util.logging.Logger.getLogger(fourier.fitting.graphic.GraphicFitting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        repaint();
    }
}