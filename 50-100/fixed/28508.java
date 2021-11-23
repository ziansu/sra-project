@java.lang.Override
public void setColor(org.jzy3d.colors.Color color) {
    this.color = color;
    if ((components) != null) {
        synchronized(components) {
            for (org.jzy3d.plot3d.primitives.AbstractDrawable d : components)
                if (d instanceof org.jzy3d.colors.ISingleColorable)
                    ((org.jzy3d.colors.ISingleColorable) (d)).setColor(color);
                
            
        }
        fireDrawableChanged(new org.jzy3d.events.DrawableChangedEvent(this, org.jzy3d.events.DrawableChangedEvent.FIELD_COLOR));
    }
}