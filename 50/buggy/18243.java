private void updateEntities() {
    for (rpEngine.graphical.objects.Entity e : vehicle.getModel())
        e.setMatrixOutdatedFlag();
    
}