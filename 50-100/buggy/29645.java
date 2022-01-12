public void setWireActive(int x, int y, int wireID, boolean active) {
    if (!(hasWire(x, y, wireID)))
        return ;
    
    byte wireData = getWireData(x, y);
    setWireData(x, y, setBit(wireData, ((wireID * 2) + 1), active), false);
}