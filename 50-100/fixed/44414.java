@java.lang.Override
public void setWireframeWidth(float width) {
    super.setWireframeWidth(width);
    if ((components) != null) {
        synchronized(components) {
            for (org.jzy3d.plot3d.primitives.AbstractDrawable c : components) {
                if ((c != null) && (c instanceof org.jzy3d.plot3d.primitives.AbstractWireframeable))
                    ((org.jzy3d.plot3d.primitives.AbstractWireframeable) (c)).setWireframeWidth(width);
                
            }
        }
    }
}