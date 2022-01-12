public void wireUpdate(int wireID, boolean active) {
    if (onCooldown(wireID, active))
        return ;
    
    setCooldown(wireID, active, true);
    boolean condition = condition();
    for (int i = 0; i < (level.maps.wireManager.WireManager.totalWires); i++) {
        if (outputs[i])
            updateWire(i, condition);
        
    }
}