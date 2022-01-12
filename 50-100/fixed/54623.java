public void flattenTransform() {
    if ((this.transformation) == null)
        return ;
    
    java.util.ArrayList<java.lang.Double> newCenter = this.transformation.map(centerX, centerY);
    this.centerX = newCenter.get(0);
    this.centerY = newCenter.get(1);
    this.transformation = null;
}