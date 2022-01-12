public void wireUpdate(int wireID, boolean active) {
    if (onCooldown(wireID))
        return ;
    
    setCooldown(wireID, true);
    boolean condition = condition();
    for (int i = 0; i < (level.maps.wireManager.WireManager.totalWires); i++) {
        if (outputs[i])
            updateWire(i, condition);
        
    }
}