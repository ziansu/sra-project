public void setEnabled(boolean enabled) {
    super.setEnabled(enabled);
    if (enabled == true) {
        if ((engine) != null)
            engine.partition.addEntity(this);
        
    }else {
        if ((engine) != null)
            engine.partition.removeEntity(this);
        
    }
}