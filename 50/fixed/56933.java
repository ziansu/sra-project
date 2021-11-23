public java.lang.String getLabel() {
    if ((label.isEmpty()) && ((polyTile) != null))
        return polyTile.getPolyName();
    else
        return label;
    
}