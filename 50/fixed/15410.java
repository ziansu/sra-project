@java.lang.Override
public void applyGeometryTransform(org.jzy3d.plot3d.transform.Transform transform) {
    synchronized(components) {
        for (org.jzy3d.plot3d.primitives.AbstractDrawable c : components) {
            c.applyGeometryTransform(transform);
        }
    }
}