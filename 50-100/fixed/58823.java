public void setAdditionalCornerDimensions(org.eclipse.draw2d.geometry.Dimension d, java.util.BitSet chosenCorners) {
    positions.clear();
    if (chosenCorners != null) {
        positions.or(chosenCorners);
    }
    if (d == null) {
        secondaryCorner.width = 0;
        secondaryCorner.height = 0;
    }else {
        secondaryCorner.width = d.width;
        secondaryCorner.height = d.height;
    }
}