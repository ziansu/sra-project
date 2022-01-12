public void hideDeferred(final org.geogebra.common.javax.swing.GBox box) {
    setVisible(false);
    box.setVisible(false);
    app.getActiveEuclidianView().remove(box);
}