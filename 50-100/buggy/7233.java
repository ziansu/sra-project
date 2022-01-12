@java.lang.Override
public void setStyleType(final org.openflexo.fge.shapes.ShapeSpecification.ShapeType shapeType) {
    final org.openflexo.fge.shapes.ShapeSpecification.ShapeType oldShapeType = this.getStyleType();
    if (oldShapeType == shapeType) {
        return ;
    }
    final org.openflexo.fge.shapes.ShapeSpecification oldSS = this.getShapeSpecification();
    this.shapeType = shapeType;
    this.pcSupport.firePropertyChange(org.openflexo.fge.control.tools.STYLE_CLASS_CHANGED, oldShapeType, this.getStyleType());
    this.pcSupport.firePropertyChange("shapeSpecification", oldSS, this.getShapeSpecification());
    this.pcSupport.firePropertyChange("styleType", oldShapeType, this.getStyleType());
}