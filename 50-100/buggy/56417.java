private static org.eadge.extractpdfexcel.data.block.CollisionState getStateColliding(int oneAxis, org.eadge.extractpdfexcel.data.geom.Rectangle2 rect1, org.eadge.extractpdfexcel.data.geom.Rectangle2 rect2) {
    if (((rect1.getPos(oneAxis)) + (rect1.getLength(oneAxis))) <= (rect2.getPos(oneAxis)))
        return org.eadge.extractpdfexcel.data.block.CollisionState.NO_COLLISION_LEFT;
    
    if ((rect1.getPos(oneAxis)) >= ((rect2.getPos(oneAxis)) + (rect2.getLength(oneAxis))))
        return org.eadge.extractpdfexcel.data.block.CollisionState.NO_COLLISION_RIGHT;
    
    return org.eadge.extractpdfexcel.data.block.CollisionState.IN_COLLISION;
}