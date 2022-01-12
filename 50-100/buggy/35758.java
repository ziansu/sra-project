@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e, pt.lsts.neptus.renderer2d.StateRenderer2D renderer) {
    if ((planElem) != null) {
        if (waypointBeingDragged)
            updateWaypointPosition(e.getPoint().getX(), e.getPoint().getY());
        else
            if (planBeingDragged)
                dragPlan(e.getPoint());
            
        
        currSelectedManeuver = null;
        dragPoint = null;
        waypointBeingDragged = false;
        planBeingDragged = false;
        savePlan();
        planElem.setBeingEdited(false);
    }else
        super.mouseReleased(e, renderer);
    
}