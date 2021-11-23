@java.lang.Override
public void updateByDrag(java.awt.Point aPoint) {
    if (radiusAbjustEnabled) {
        this.updateRadiusByDrag(aPoint);
        pencilDistance = ((previousPencilDistance) * (radius)) / (previousRadius);
    }else
        if (pencilMoveEnabled) {
            this.updatePencilCenterByDrag(aPoint);
        }
    
    this.updateTapArea();
    return ;
}