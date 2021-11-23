public boolean isMatched(edu.umn.cs.spatialHadoop.core.Shape shape) {
    edu.umn.cs.spatialHadoop.core.Rectangle shapeMBR = shape.getMBR();
    if (((inputQueryRange) != null) && (!(shape.isIntersected(inputQueryRange))))
        return false;
    
    if (!(cellMBR.isValid()))
        return true;
    
    double reference_x = java.lang.Math.max(cellMBR.x1, shapeMBR.x1);
    double reference_y = java.lang.Math.max(cellMBR.y1, shapeMBR.y1);
    return cellMBR.contains(reference_x, reference_y);
}