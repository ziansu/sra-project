@java.lang.Override
public void setWireframeColor(org.jzy3d.colors.Color color) {
    super.setWireframeColor(color);
    if ((components) != null) {
        synchronized(components) {
            for (org.jzy3d.plot3d.primitives.AbstractDrawable c : components) {
                if ((c != null) && (c instanceof org.jzy3d.plot3d.primitives.AbstractWireframeable))
                    ((org.jzy3d.plot3d.primitives.AbstractWireframeable) (c)).setWireframeColor(color);
                
            }
        }
    }
}