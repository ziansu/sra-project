public Model.ResourcePoint addFiniteResourcePoint(Model.FiniteResource resourceType, Utility.RenderObject.RENDER_OBJECT_ENUM renderEnum, float xPoss, float yPoss, double radius) {
    Model.ResourcePoint point = new Model.ResourcePoint(resourceType, renderEnum, xPoss, yPoss, radius);
    if (collidables.canAdd(point)) {
        this.collidables.add(point);
        this.collidablesR.add(point);
        this.statics.add(point);
        Constants.PATHFINDER_OBJECT.updateMask(point);
        return point;
    }
    return null;
}