public static void addProjectionChangeListener(org.openstreetmap.josm.data.projection.ProjectionChangeListener listener) {
    if (listener == null)
        return ;
    
    synchronized(org.openstreetmap.josm.Main.class) {
        for (java.lang.ref.WeakReference<org.openstreetmap.josm.data.projection.ProjectionChangeListener> wr : org.openstreetmap.josm.Main.listeners) {
            if ((wr.get()) == listener)
                return ;
            
        }
        org.openstreetmap.josm.Main.listeners.add(new java.lang.ref.WeakReference<org.openstreetmap.josm.data.projection.ProjectionChangeListener>(listener));
    }
}