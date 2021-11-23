@java.lang.Override
protected void computeArea() {
    area = org.concord.energy3d.util.Util.computeArea(mesh);
    for (final org.concord.energy3d.model.HousePart child : children)
        if ((child instanceof org.concord.energy3d.model.Window) || (child instanceof org.concord.energy3d.model.Door))
            area -= child.getArea();
        
    
}