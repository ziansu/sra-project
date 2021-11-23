public void add(java.util.List<? extends org.jzy3d.plot3d.primitives.AbstractDrawable> drawables) {
    synchronized(components) {
        components.addAll(drawables);
    }
}