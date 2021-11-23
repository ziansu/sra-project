@java.lang.Override
public void paint(java.awt.Graphics2D g, pt.lsts.neptus.renderer2d.StateRenderer2D renderer) {
    this.renderer = renderer;
    if (((planElem) != null) && (waypointBeingDragged)) {
        planElem.setRenderer(renderer);
        planElem.paint(((java.awt.Graphics2D) (g.create())), renderer);
    }
}