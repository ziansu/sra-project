public synchronized void setTransform(org.jzy3d.plot3d.transform.Transform transform) {
    this.transform = transform;
    synchronized(components) {
        for (org.jzy3d.plot3d.primitives.AbstractDrawable c : components) {
            if (c != null)
                c.setTransform(transform);
            
        }
    }
}