public boolean equals(java.lang.Object other) {
    if (!(other instanceof oharaShapes3D.CubicShape))
        throw new java.lang.IllegalArgumentException("Compared object must be a CubicShape");
    else {
        oharaShapes3D.CubicShape cs = ((oharaShapes3D.CubicShape) (other));
        return (((this.getLength()) == (cs.getLength())) && ((this.getWidth()) == (cs.getWidth()))) && ((this.getHeight()) == (cs.getHeight()));
    }
}