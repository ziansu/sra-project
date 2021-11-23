public void add(final org.concord.energy3d.model.HousePart housePart, final boolean redraw) {
    org.concord.energy3d.scene.SceneManager.getTaskManager().update(new java.util.concurrent.Callable<java.lang.Object>() {
        @java.lang.Override
        public java.lang.Object call() {
            final org.concord.energy3d.model.HousePart container = housePart.getContainer();
            if (container != null)
                container.getChildren().add(housePart);
            
            add(housePart);
            return null;
        }
    });
    if (redraw)
        redrawAll();
    
}